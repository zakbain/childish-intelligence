package consciousness;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import emotions.Heart;
import io.WritingHelper;
import math.Node;

/**
 * Responsible for controlling the memory and analysis of thoughts. The
 * combination of @allThoughts and @popularThoughts represents the memory.
 * 
 * @author Zak_b
 *
 */
public class Brain {
	/**
	 * A queue with every single thought ever thoughtd by this brain.
	 */
	private Queue<Node<Thought>> allThoughts;

	/**
	 * A list of thoughts the brain frequents.
	 */
	private List<Node<Thought>> popularThoughts;

	private WritingHelper logWriter;

	public Brain(String logFileName) {
		// Initialize member variables
		allThoughts = new LinkedList<Node<Thought>>();
		popularThoughts = new ArrayList<Node<Thought>>();
		logWriter = new WritingHelper(logFileName);
	}

	/**
	 * Think about an thought. Interact with the heart to guide our thinking.
	 * Log thoughts into the specified log.
	 * 
	 * @param startThought
	 *            The thought to start the thought process.
	 * @param heart
	 *            The heart used to guide our thinking.
	 * @param desiredThoughtCount
	 *            The number of thoughts to think.
	 * @param logFileName
	 *            The log for recording the thoughts.
	 */
	public void thinkAbout(Node<Thought> startThought, Heart heart, int desiredThoughtCount, String logFileName) {
		// Log the thought we started thinking about
		logWriter.writeLine("NEW THOUGHT PROCESS: " + startThought.getValue().getDescription());

		// Remember current thought for traversing below
		Node<Thought> currentThought = startThought;

		// Number of thoughts we still have to think
		int remainingThoughtCount = desiredThoughtCount;
		while (remainingThoughtCount > 0) {
			// Find a related thought
			currentThought = findRandomConnectedThought(currentThought);

			if (currentThought == null) {
				// If we found no connected thoughts, end the thought process
				remainingThoughtCount = 0;
			} else {
				// If we found a connected thought, log it and continue
				logWriter.write("\t" + currentThought.getValue().getDescription());
				remainingThoughtCount--;
			}
		}
	}

	/**
	 * 
	 * @param thought
	 */
	private Node<Thought> findStrongestConnectedThought(Node<Thought> thought) {
		return null;
	}

	/**
	 * Find a random thought that is connected to the given thought.
	 * 
	 * @param thought
	 *            The thought node from which to start finding connections.
	 * @return The connected thought that was discovered. NULL if no thought is
	 *         found.
	 */
	private Node<Thought> findRandomConnectedThought(Node<Thought> thought) {
		Node<Thought> randomConnectedThought = null;

		// Get all nodes connected to this thought
		Set<Node<Thought>> connectedNodes = thought.getEdges().keySet();

		// If there is at least one node, designate it is as our random thought
		Iterator<Node<Thought>> nodeIterator = connectedNodes.iterator();
		if (nodeIterator.hasNext()) {
			randomConnectedThought = nodeIterator.next();
		}

		return randomConnectedThought;
	}

	/**
	 * Save the thought in memory.
	 * 
	 * @param thought
	 *            The thought to save
	 */
	public void save(Node<Thought> thought) {
		allThoughts.add(thought);
	}

	/**
	 * Save an thought in memory, but handle it specially because it is popular.
	 * MOST LIKELY WILL BE DELETED.
	 * 
	 * Suggested Implementation: Make popular thoughts faster to access.
	 */
	public void savePopular(Node<Thought> thought) {
		allThoughts.add(thought);

		// Add to popular thoughts list so we can access faster
		popularThoughts.add(thought);
	}
}
