package adapter;

// Modem converts Analog signal to digital
// Implementing the interface that my client would use on his laptop
public class Modem implements Digital{
	
	Analog analog;
	
	public Modem(Analog a) {
		analog = a;
	}
	
	public void recieveSignal() {
		analog.sendSignal();
	}

}
