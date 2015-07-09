package election;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidateListTest {
	
	CandidateList cl = new CandidateList();

	@Test
	public void testCandidateList() {
		assertNotNull(cl);
	}
	
	@Test
	public void testNotSame() {
		VoterList vl = new VoterList();
		assertNotSame(vl,cl);
	}

}
