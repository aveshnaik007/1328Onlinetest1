package election;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvMachine evm = new EvMachine();
		CandidateList cl = new CandidateList();
		
		VoterList vl = new VoterList();
		
		evm.EVservice(vl.getVlist().get(1),cl);
		
	}

}
