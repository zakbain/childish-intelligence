package conscious;

import java.util.List;
import java.util.Queue;

import anatomy.Heart;

/**
 * Responsible for controlling the memory and analysis of experiences.
 * 
 * @author Zak_b
 *
 */
public class Brain {
	/**
	 * A queue with every single experience ever experienced by this brain.
	 */
	private Queue<Experience> allExperiences;

	/**
	 * A list of experiences the brain frequents.
	 */
	public List<Experience> popularExperiences;

	/**
	 * Think about an experience. Interact with the heart to guide our thinking.
	 * Log thoughts into the specified log.
	 * 
	 * @param startExperience
	 *            The experience to start the thought process.
	 * @param heart
	 *            The heart used to guide our thinking.
	 * @param logFileName
	 *            The log for recording the thoughts.
	 */
	public void thinkAbout(Experience startExperience, Heart heart, String logFileName) {

	}
}
