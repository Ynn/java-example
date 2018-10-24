package cours.exemple.heritage.itf.methode.object;

import java.util.UUID;

public abstract class AbstractDevice implements IDevice {

	private String serial;
	private String location;

	public AbstractDevice(String location) {
		this.serial = UUID.randomUUID().toString();
		this.location = location;
	}

	@Override
	public String getSerial() {
		return serial;
	}

	@Override
	public String getLocation() {
		return location;
	}

	@Override
	public void switchState() {
		/*
		 * Ici j'ai le droit d'appeler une méthode qui n'est pas encore connue car elle
		 * sera connue dans les méthodes des classes filles.
		 */
		if (this.isOn()) {
			turnOff();
		} else {
			turnOn();
		}
	}

	@Override
	public String toString() {
		return String.format(" loc = %s %n isOn = %b %n serial = %s %n classe = %s", location, isOn(), getSerial(),
				getClass().getSimpleName());
	}
}
