package emotions;

import java.util.ArrayList;
import java.util.List;

import experiences.Experience;
import math.Point;

/**
 * The heart used by Pet Agent.
 * 
 * @author Zak_b
 *
 */
public class PetHeart implements Heart {
	// We're using 2 dimensions for the "emotional plane"
	private static int DIMENSION_COUNT = 2;

	// A point to represent where the heart is at this moment
	private Point currentState;

	/**
	 * The set of emotional extremes. As in each emotion held in this set such
	 * as happy or sad is meant to represent the maximum potential feeling of
	 * happiness or sadness
	 */
	private static List<Point> extremeEmotionsSet;

	/**
	 * Default constructor for the pet heart.
	 */
	public PetHeart() {
		currentState = new Point(DIMENSION_COUNT);
		extremeEmotionsSet = new ArrayList<Point>();
	}

	@Override
	public String stateDescription() {
		return "Fucked";
	}

	@Override
	public Point getState() {
		return currentState;
	}

	@Override
	public void processExperience(Experience experience) {

	}

	@Override
	public void normalizeCurrentState() {

	}
}
