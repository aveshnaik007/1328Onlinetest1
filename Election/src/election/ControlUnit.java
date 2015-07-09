package election;

public class ControlUnit {
	
	DisplaySection ds;
	CandidateSetSection css;
	ResultSection rs;
	BallotSection bs;
	
	public ControlUnit(){
		ds = new DisplaySection();
		css = new CandidateSetSection();
		rs = new ResultSection();
		bs = new BallotSection();
	}

}
