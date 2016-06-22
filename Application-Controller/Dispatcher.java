public class Dispatcher {
	
	private Mallory Mallory;
	private Albert Albert;
	private Justin Justin;
	
	public Dispatcher() {
		Mallory = new Mallory();
		Albert = new Albert();
		Justin = new Justin();
	}
	
	public void dispatch(String request) {
		
		if(request.equalsIgnoreCase("Mallory")) {
			Mallory.bio();
		}
		
		else if(request.equalsIgnoreCase("Albert")) {
			Albert.bio();
		}
		
		else {
			Justin.bio();
		}
	}
}
