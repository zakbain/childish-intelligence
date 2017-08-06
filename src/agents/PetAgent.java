package agents;

import anatomy.Heart;
import anatomy.PetHeart;
import conscious.Experience;

public class PetAgent implements Agent {
	private Heart petHeart;

	/**
	 * Very temporary. The int is a terrible way of distinguishing what type of
	 * agent this should be.
	 * 
	 * @param i
	 */
	public PetAgent(int i) {
		petHeart = new PetHeart();
	}

	public void Process(Experience experience) {

	}
}
