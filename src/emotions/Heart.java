package emotions;

import experiences.Experience;
import math.Point;

/**
 * Class to read and control emotions.
 * 
 * @author Zak_b
 *
 */
public interface Heart {

	/**
	 * Get current state. Represents how the heart feels at this moment.
	 * 
	 * @return current state
	 */
	public Point getState();

	/**
	 * Reports a version of how it is feeling that may be understood by humans.
	 * 
	 * @return A human-readable version of the heart's current state
	 */
	public String stateDescription();

	/**
	 * Process the experience, potentially changing the heart's current state.
	 * 
	 * @param experience
	 *            The experience to process
	 */
	public void processExperience(Experience experience);

	/**
	 * The heart is responsible for normalizing the convex set to ensure that
	 * the current state is within the bounds of the convex set. This function
	 * is public because child classes may decide how they choose to normalize
	 * the state.
	 */
	public void normalizeCurrentState();
}
