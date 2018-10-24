package cours.exemple.heritage.itf.methode.object;

//Notez bien qu'on utilise impléments et pas extend :
public class LampeKNX extends AbstractDevice {

	public boolean isOn = false;

	LampeKNX(String location) {
		super(location);
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return isOn;
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
