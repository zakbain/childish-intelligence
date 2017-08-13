package emotions;

import anatomy.BodyPart;
import consciousness.Thought;

/**
 * Class to read and control emotions.
 * 
 * @author Zak_b
 *
 */
public interface Heart extends BodyPart {

	/**
	 * Reports how the heart is feeling in a way that may be understood by
	 * humans.
	 * 
	 * @return A human-readable version of the heart's current state
	 */
	public String stateDescription();

	/**
	 * Process the thought, potentially changing the heart's current state.
	 * 
	 * @param thought
	 *            The thought to process
	 */
	public void processThought(Thought thought);

	/**
	 * The heart is responsible for normalizing the convex set to ensure that
	 * the current state is within the bounds of the convex set. This function
	 * is public because child classes may decide how they choose to normalize
	 * the state.
	 */
	public void normalizeCurrentState();
}
