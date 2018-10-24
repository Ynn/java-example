package cours.exemple.heritage.et.itf;

import java.util.UUID;

public abstract class AbstractCapteur implements ICapteur {

	private String serial;
	private String location;

	public AbstractCapteur(String location) {
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
}
