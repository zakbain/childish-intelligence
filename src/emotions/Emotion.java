package emotions;

import math.Point;

/**
 * Modeled after but not restricted to the human version of emotion as a complex
 * experience of consciousness, sensation and behavior that reflects the
 * personal significance of a thing, an event, or a state of affairs.
 * 
 * These emotions act as ranges where an agent's heart will feel anywhere from
 * none of that emotion to the maximum (where you can never hit the maximum)
 * 
 * @author Zak_b
 *
 */
public class Emotion {
	// We're using 2 dimensions for the "emotional plane"
	private static int DIMENSION_COUNT = 2;
	private static int X_AXIS = 0;
	private static int Y_AXIS = 1;

	private Point position;

	/**
	 * Creates a point at position (x, y) along a 2 dimensional axis.
	 */
	public Emotion(int x, int y) {
		position = new Point(DIMENSION_COUNT);
		position.setCoordinate(X_AXIS, x);
		position.setCoordinate(Y_AXIS, y);
	}
}
