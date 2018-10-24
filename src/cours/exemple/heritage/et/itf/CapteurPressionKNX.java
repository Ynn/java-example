package cours.exemple.heritage.et.itf;

import java.util.UUID;

public class CapteurPressionKNX extends AbstractCapteur implements ICapteurPression {

	public CapteurPressionKNX(String location) {
		super(location);
	}

	public boolean on;

	@Override
	public boolean isOn() {
		return on;
	}

	@Override
	public void turnOn() {
		on = true;
	}

	@Override
	public void turnOff() {
		on = false;
	}

	@Override
	public double getPression() {
		// TODO Auto-generated method stub
		return Math.random() * 600;
	}

}
