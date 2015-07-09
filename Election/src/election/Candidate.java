package election;

public class Candidate {
	
	String Name;
	int votecout;
	
	public Candidate(String nav) {
		Name = nav;
		votecout = 0;
	}

	public int getVotecout() {
		return votecout;
	}

	public void setVotecout(int votecout) {
		this.votecout = votecout;
	}
	
	

}
