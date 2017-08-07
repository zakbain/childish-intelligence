package consciousness;

/**
 * Anything an agent can thought. This is deliberately left open ended as the
 * goal of the AI is to be able to thought as much as possible.
 * 
 * @author Zak_b
 *
 */
public class Thought {
	/**
	 * Description of thought
	 */
	private String description;

	/**
	 * When the thought happened
	 */
	private ApproximateDate approximateTime;

	/**
	 * Default Constructor.
	 * 
	 * @param description
	 *            A description of the thought.
	 * @param approximateTime
	 *            The approximate time of the thought.
	 */
	public Thought(String description, ApproximateDate approximateTime) {
		this.description = description;
		this.approximateTime = approximateTime;
	}

	/**
	 * Report the description.
	 * 
	 * @return the description of this thought.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description to specified value.
	 * 
	 * @param description
	 *            The new description.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Sets the approximate time.
	 * 
	 * @param approximateDate
	 */
	public void setApproximateTime(ApproximateDate approximateTime) {
		this.approximateTime = approximateTime;
	}

	/**
	 * Reports the approximate time.
	 * 
	 * @return the time.
	 */
	public ApproximateDate getApproximateTime() {
		return approximateTime;
	}
}
