package agents;

import consciousness.Brain;
import consciousness.Thought;
import emotions.Heart;
import emotions.PetHeart;
import math.Node;

public class PetAgent implements Agent {
	/**
	 * Controls the emotions of this pet.
	 * 
	 * @NOTE 8-7: Heart doesn't do anything ATM
	 */
	private Heart petHeart;
	/**
	 * Controls the thoughts and memory of this pet.
	 */
	private Brain petBrain;

	private Node<Thought> recentThought;

	/**
	 * Very temporary. The int is a terrible way of distinguishing what type of
	 * agent this should be.
	 * 
	 * @param i
	 */
	public PetAgent(int i, String logFileName) {
		petHeart = new PetHeart();
		petBrain = new Brain(logFileName);
	}

	public void Process(Thought thought) {
		// Create a node with relevant connections
		Node<Thought> thoughtNode = createNode(thought);

		petBrain.saveThought(thoughtNode);
		petBrain.savePopularThought(thoughtNode);
	}

	public Node<Thought> createNode(Thought thought) {
		return null;
	}
}
