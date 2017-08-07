package agents;

import consciousness.Brain;
import consciousness.Thought;
import emotions.Heart;
import emotions.PetHeart;

public class PetAgent implements Agent {
	private Heart petHeart;
	private Brain petBrain;

	/**
	 * Very temporary. The int is a terrible way of distinguishing what type of
	 * agent this should be.
	 * 
	 * @param i
	 */
	public PetAgent(int i) {
		petHeart = new PetHeart();
	}

	public void Process(Thought thought) {

	}
}
