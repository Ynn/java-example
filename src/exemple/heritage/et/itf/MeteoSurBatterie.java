package exemple.heritage.et.itf;

public class MeteoSurBatterie extends Meteo implements ICapteurSurBatterie {

	public MeteoSurBatterie(String location) {
		super(location);
	}

	@Override
	public int getNiveauBat() {
		return (int) (53 + (Math.random() * 5));
	}

}
