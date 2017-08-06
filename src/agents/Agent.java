package agents;

import consciousness.Experience;

/**
 * Agent that can navigate, process, and adapt to an environment while
 * interfacing with its emotions to make decisions.
 * 
 * @author Zak_b
 *
 */
public interface Agent {

	/**
	 * Process the experience in a personal way. Very open ended to allow for a
	 * wide range of reactions to experiences. One requirement is that as the
	 * computer grows it learns new ways to process experiences.
	 */
	public void Process(Experience experience);
}
