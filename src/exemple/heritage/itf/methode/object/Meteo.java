package exemple.heritage.itf.methode.object;

public class Meteo extends AbstractCapteur implements ICapteurTemperature, ICapteurPression {

	public Meteo(String location) {
		super(location);
	}

	private boolean on = true;

	@Override
	public boolean isOn() {
		return false;
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
	public double getPression() {
		return 600 + Math.random();
	}

	@Override
	public double getTemperature() {
		return 25 + Math.random();
	}

}
