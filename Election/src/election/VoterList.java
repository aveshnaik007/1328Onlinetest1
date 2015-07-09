package election;

import java.util.ArrayList;

public class VoterList {
	
	ArrayList<Voter> vlist = new ArrayList<Voter>();
	
	public VoterList(){
		vlist = this.createList();
	}
	
	public ArrayList<Voter> createList() {
		ArrayList<Voter> list = new ArrayList<Voter>();
		list.add(new Voter("Girish",111));
		list.add(new Voter("Prajact",101));
		list.add(new Voter("Amit",555));
		return list;
	}

}
