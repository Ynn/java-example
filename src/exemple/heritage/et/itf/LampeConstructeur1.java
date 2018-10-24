package exemple.heritage.et.itf;

import java.util.UUID;

//Notez bien qu'on utilise impléments et pas extend :
public class LampeConstructeur1 implements Capteur {

	public String serial;
	public boolean isOn = false;

	LampeConstructeur1() {
		this.serial = UUID.randomUUID().toString();
	}

	@Override
	public boolean isOn() {
		return isOn;
	}

	@Override
	public String getSerial() {
		return serial;
	}

	@Override
	public void turnOn() {
		isOn = true;
	}

	@Override
	public void turnOff() {
		isOn = false;
	}

}
