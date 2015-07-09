package election;

import java.util.ArrayList;

public class BallotingUnit {
	Lamp readylamp,candidatelamp;
	ArrayList<CandidateButton> cb = new ArrayList<CandidateButton>();
	BollatPaperScreen Bps;
	
	public BallotingUnit(CandidateList cl) {
		readylamp = new BollatReadyLamp();
		candidatelamp = new BollatCandidateLamp();
		for(int i=0;i<cl.allCL.size();i++){
			cb.add(new CandidateButton((cl.allCL.get(i))));
		}
		Bps = new BollatPaperScreen(cl);
	}
	
	public void useBallot(Voter v) {
		
	}
		
}
