package emotions;

import java.util.ArrayList;
import java.util.List;

import consciousness.Thought;

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
	private List<Emotion> extremeEmotions;

	/**
	 * A list to describe the degree with which each emotion is felt. 0 means
	 * the heart is feeling none of that emotion and 1 would mean they are
	 * feeling only that emotion. As of 8/4/17, we do not allow a degree to be 0
	 * or 1.
	 */
	private List<Integer> degreeOfExtremes;

	/**
	 * Chemicals that may be
	 */
	private List<Integer> heartChemicals;

	/**
	 * Create sadness, happiness, anger, and fear. Put the four emotions at 4
	 * corners of plane to create a diamond. This is just to create a sexy
	 * visual.
	 */
	private void createExtremeEmotions() {
		// Init
		extremeEmotions = new ArrayList<Emotion>();

		Emotion maxSadness = new Emotion(0, -1);
		extremeEmotions.add(maxSadness);

		Emotion maxHappiness = new Emotion(0, 1);
		extremeEmotions.add(maxHappiness);

		Emotion maxAnger = new Emotion(1, 0);
		extremeEmotions.add(maxAnger);

		Emotion maxFear = new Emotion(-1, 0);
		extremeEmotions.add(maxFear);
	}

	private void createStartDegrees() {
		degreeOfExtremes = new ArrayList<Integer>();
		for (int i = 0; i < extremeEmotions.size(); i++) {

		}
	}

	private void createHeartChemicals() {

	}

	private void addHeartChemical() {

	}

	/**
	 * Default constructor for the pet heart.
	 */
	public PetHeart() {
		createExtremeEmotions();
		createStartDegrees();
	}

	@Override
	public String stateDescription() {
		return "Fucked";
	}

	@Override
	public void processThought(Thought thought) {

	}

	@Override
	public void normalizeCurrentState() {

	}
}
