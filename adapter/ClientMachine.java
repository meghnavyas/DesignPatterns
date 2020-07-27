package adapter;

public class ClientMachine {
	
	public static void main(String args[]) {
	
	InternetConnection net = new InternetConnection();
	LaptopNetwork client = new LaptopNetwork();
	
	// Adapter object
	Modem modem = new Modem(net);
	
	System.out.println("Connecting to the internet ...");
	modem.recieveSignal();
	
	}

}
