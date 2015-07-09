package election;

public class EvMachine {
	
	private BallotingUnit Bu;
	private ControlUnit Cu;
	
	public EvMachine() {
		Cu = new ControlUnit();
	}
	
	public void EVservice(Voter v,CandidateList cl) {
		Bu = new BallotingUnit(cl);
		Bu.useBallot();
	}

}
