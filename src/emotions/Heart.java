package emotions;

import experiences.Experience;
import math.ConvexSet;

/**
 * Class to read and control emotions.
 * 
 * @author Zak_b
 *
 */
public class Heart {
	private ConvexSet currentState;

	/**
	 * Get current state. Represents how the heart feels at this moment.
	 * 
	 * @return current state
	 */
	public ConvexSet getState() {
		return currentState;

	}

	public void processExperience(Experience experience) {

	}
}
