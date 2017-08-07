package consciousness;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
	public void thinkAbout(Thought startThought, Heart heart, int desiredThoughtCount, String logFileName) {
		// Log the thought we started thinking about
		logWriter.writeLine("NEW THOUGHT: " + startThought.getDescription());

		// Remember current thought for traversing below
		Thought currentThought = startThought;

		// Number of thoughts we still have to think
		int remainingThoughtCount = desiredThoughtCount;
		while (remainingThoughtCount > 0) {
			// Find a related thought
			currentThought = findStrongestConnectedThought(currentThought);
		}
	}

	/**
	 * 
	 * @param thought
	 */
	private Thought findStrongestConnectedThought(Thought thought) {
		return null;
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
