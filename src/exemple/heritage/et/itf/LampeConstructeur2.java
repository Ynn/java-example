package exemple.heritage.et.itf;

//Notez bien qu'on utilise impléments et pas extend :
public class LampeConstructeur2 implements Capteur {

	public String serial;
	public boolean isOn = false;

	LampeConstructeur2(String serial) {
		this.serial = serial;
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
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
