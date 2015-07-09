package election;

public class CandidateButton implements Button{
	
	Candidate cb;
	
	public CandidateButton(Candidate cn){
		cb = cn;
	}

	@Override
	public void press() {
		// TODO Auto-generated method stub
		System.out.println("Candidate Button press");
	}
	

}
