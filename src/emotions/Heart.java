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

	/**
	 * Process the experience in a personal way. Very open ended to allow for a
	 * wide range of reactions to experiences. One requirement is that as the
	 * computer grows it learns new ways to process experiences.
	 * 
	 * @param experience
	 */
	public void processExperience(Experience experience) {

	}

	/**
	 * The heart is responsible for normalizing the convex set to ensure that
	 * the current state is within the bounds of the convex set. This function
	 * is public because child classes may decide how they choose to normalize
	 * the state.
	 */
	public void normalizeCurrentState() {

	}
}
