package exemple.heritage.itf.methode.object;

import java.util.UUID;

//Notez bien qu'on utilise impléments et pas extend :
public class LampePhilipsHue extends AbstractCapteur {

	public LampePhilipsHue(String location) {
		super(location);
	}

	public String serial;
	public boolean isOn = false;

	@Override
	public boolean isOn() {
		// Fait un traitement compliqué :
		// HTTP :
		return isOn;
	}

	@Override
	public void turnOn() {
		// Appel HTTP :
		isOn = true;
	}

	@Override
	public void turnOff() {
		// Appel HTTP :
		isOn = false;
	}

}
