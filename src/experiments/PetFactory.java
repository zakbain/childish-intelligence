package experiments;

import java.util.ArrayList;
import java.util.List;

import agents.Agent;
import agents.PetAgent;
import consciousness.Thought;

public class PetFactory {

	/**
	 * 
	 * @param count
	 * @return
	 */
	private static List<Thought> createRandomThoughts(int count) {
		List<Thought> randomThoughts = new ArrayList<Thought>(count);

		// Create a list of thoughts using the iterator for unique names
		for (int i = 0; i < count; i++) {
			randomThoughts.add(new Thought("Thought" + i));
		}

		return randomThoughts;
	}

	public static void main(String[] args) {
		String brainLog = "brainLog.log";

		// Hack together a quick pet AI
		Agent libra = new PetAgent(0, brainLog);
		Agent venus = new PetAgent(1, brainLog);

		List<Thought> randomThoughts = createRandomThoughts(20);
		for (Thought thought : randomThoughts) {
			libra.process(thought);
		}

		libra.startRandomThoughtProcess(5);
	}
}