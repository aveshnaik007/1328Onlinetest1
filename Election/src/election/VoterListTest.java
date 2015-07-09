package election;

import static org.junit.Assert.*;

import org.junit.Test;

public class VoterListTest {
	
	VoterList vl = new VoterList();

	@Test
	public void testVoterList() {
		assertEquals("Amit",vl.getVlist().get(2).name);
	}
	
	@Test
	public void checkIfEmp() {
		assertNotNull(vl.getVlist());
	}
	
	@Test
	public void testVotListAndCandidate() {
		CandidateList ll = new CandidateList();
		assertNotSame(ll,vl);
	}

}
