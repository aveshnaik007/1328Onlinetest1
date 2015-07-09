package election;

public class ResultSection {
	
	CloseButton cb;	
	ResultButton1 rb1;
	ResultButton2 rb2;
	ClearButton cle;
	
	public ResultSection() {
		cb = new CloseButton();
		rb1 = new ResultButton1();
		rb2 = new ResultButton2();
		cle = new ClearButton();
		
	}

}
