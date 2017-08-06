package emotions;

import consciousness.Experience;

/**
 * Class to read and control emotions.
 * 
 * @author Zak_b
 *
 */
public interface Heart {

	/**
	 * Reports how the heart is feeling in a way that may be understood by
	 * humans.
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
