package exemple.heritage.et.itf;

import java.util.UUID;

public abstract class AbstractCapteur implements Capteur {

	private boolean on = true;
	private String serial;

	@Override
	public boolean isOn() {
		return on;
	}

	@Override
	public String getSerial() {
		if (serial == null) {
			this.serial = UUID.randomUUID().toString();
		}
		return serial;
	}

	@Override
	public void turnOn() {
		on = true;
	}

	@Override
	public void turnOff() {
		on = false;
	}
}
