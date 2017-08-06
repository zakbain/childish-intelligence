package emotions;

import java.util.ArrayList;
import java.util.List;

import consciousness.Experience;

/**
 * The heart used by Pet Agent.
 * 
 * @author Zak_b
 *
 */
public class PetHeart implements Heart {
	/**
	 * The list of emotional extremes. As in each emotion held in this list such
	 * as happy or sad is meant to represent the maximum potential feeling of
	 * happiness or sadness
	 */
	private static List<Emotion> extremeEmotions;

	/**
	 * A list to describe the degree with which each emotion is felt. 0 means
	 * the heart is feeling none of that emotion and 1 would mean they are
	 * feeling only that emotion. As of 8/4/17, we do not allow a degree to be 0
	 * or 1.
	 */
	private List<Integer> degreeOfExtremes;

	/*
	 * 
	 */
	private static void createExtremeEmotions() {
		
	}

	/**
	 * Default constructor for the pet heart.
	 */
	public PetHeart() {
		extremeEmotions = new ArrayList<Emotion>();
	}

	@Override
	public String stateDescription() {
		return "Fucked";
	}

	@Override
	public void processExperience(Experience experience) {

	}

	@Override
	public void normalizeCurrentState() {

	}
}
