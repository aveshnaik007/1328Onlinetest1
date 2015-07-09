package election;

import java.util.ArrayList;

public class CandidateList {
	
	ArrayList<Candidate> allCL = new ArrayList<Candidate>();

	public CandidateList() {
		allCL = this.createList();
	}
	
	private ArrayList<Candidate> createList() {
		ArrayList<Candidate> cl = new ArrayList<Candidate>();
		cl.add(new Candidate("James"));
		cl.add(new Candidate("Raju"));
		cl.add(new Candidate("D'costa"));
		cl.add(new Candidate("Rohit"));
		cl.add(new Candidate("Sachine"));
		return cl;
	}
	
}
