package exemple.heritage.et.itf;

import java.util.UUID;

public class CapteurTemperatureZigbee extends AbstractCapteur implements ICapteurTemperature {

	public CapteurTemperatureZigbee(String location) {
		super(location);
	}

	private boolean on = true;

	@Override
	public boolean isOn() {
		return on;
	}

	@Override
	public void turnOn() {
		// Fait un traitement compliqué et passe le booléen a vraie
		on = true;
	}

	@Override
	public void turnOff() {
		on = false;
	}

	@Override
	public double getTemperature() {
		return Math.random() * 30;
	}

}
