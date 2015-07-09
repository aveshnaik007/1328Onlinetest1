package election;

public class EvMachine {
	
	BallotingUnit Bu;
	ControlUnit Cu;
	
	public EvMachine() {
		Bu = new BallotingUnit();
		Cu = new ControlUnit();
	}

}
