package math;

/**
 * A point in an n dimensional plane.
 * 
 * @author Zak_b
 *
 */
public class Point {
	/**
	 * The number of dimensions
	 */
	private int dimensions;

	/**
	 * The coordinates specifying where the point is in the plane.
	 * cooordinates.length must equal dimensions
	 */
	private int[] coordinates;

	/**
	 * Constructor
	 * 
	 * @param dimensions
	 */
	public Point(int dimensions) {
		coordinates = new int[dimensions];
	}
}
