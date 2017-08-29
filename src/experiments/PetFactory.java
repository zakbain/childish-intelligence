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
		for (int i = 0; i < count; i += 2) {
			randomThoughts.add(new Thought("Pet woo " + i));
		}

		for (int i = 1; i < count; i += 2) {
			randomThoughts.add(new Thought("Scold woo " + i));
		}

		return randomThoughts;
	}

	public static void main(String[] args) {
		String brainLog = "brainLog.log";
		String heartLog = "heartLog.log";

		// Hack together a quick pet AI
		Agent libra = new PetAgent(0, heartLog, brainLog);
		Agent venus = new PetAgent(1, heartLog, brainLog);

		List<Thought> randomThoughts = createRandomThoughts(15);
		for (Thought thought : randomThoughts) {
			libra.process(thought);
		}

		libra.startRandomThoughtProcess(12);
	}
}