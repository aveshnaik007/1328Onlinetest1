package election;

public class DisplaySection {
	
	OnLamp ol;
	BusyLamp bl;
	TwoDigtDisplay tdd;
	FourDigtDisplay fdd;
	
	public DisplaySection() {
		ol = new OnLamp();
		bl = new BusyLamp();
		tdd = new TwoDigtDisplay();
		fdd = new FourDigtDisplay();
	}

}
