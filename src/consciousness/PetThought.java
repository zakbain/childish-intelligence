package consciousness;

/**
 * An thought unique to pets.
 * 
 * 8/5/17 - Ultimately, this class might be useless. I'd like thought to be a
 * very simple class with the complexity lying in how the brain and heart deal
 * with the thought.
 * 
 * @author Zak_b
 *
 */
public class PetThought extends Thought {
	public PetThoughtType type;

	/**
	 * Construct PetThought by specifying the description, approximate time, and
	 * the type of the pet thought.
	 * 
	 * @param description
	 *            Description of the thought
	 * @param approximateTime
	 *            Approximate time of thought
	 * @param type
	 *            Type of thought
	 */
	public PetThought(String description, ApproximateDate approximateTime, PetThoughtType type) {
		super(description, approximateTime);

		this.type = type;
	}

}
