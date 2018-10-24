package exemple.heritage.itf.methode.object;

public abstract class AbstractCapteurTemp extends AbstractCapteur implements ICapteurTemperature {

	public AbstractCapteurTemp(String location) {
		super(location);
	}

	@Override
	public String toString() {
		return String.format("%s %n temp = %s", super.toString(), getTemperature());
	}

}
