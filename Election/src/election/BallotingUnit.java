package election;

public class BallotingUnit {
	Lamp readylamp,candidatelamp;
	CandidateButton cb;
	BollatPaperScreen Bps;
	
	public BallotingUnit() {
		readylamp = new BollatReadyLamp();
		candidatelamp = new BollatCandidateLamp();
		cb = new CandidateButton();
		Bps = new BollatPaperScreen();
	}
		
}
