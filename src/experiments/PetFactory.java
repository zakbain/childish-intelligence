package experiments;

import agents.Agent;
import agents.PetAgent;

public class PetFactory {

	public static void main(String[] args) {
		String brainLog = "brainLog.log";

		// Hack together a quick pet AI
		Agent libra = new PetAgent(0, brainLog);
		Agent venus = new PetAgent(1, brainLog);

		System.out.println("AAAAAHHHHHHHHHH");
	}
}