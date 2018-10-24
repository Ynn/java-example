package exemple.heritage.et.itf;

public interface Capteur {

	/**
	 * Teste si le capteur est allumé.
	 *
	 * @return vraie si le capteur est allumé
	 */
	public boolean isOn();

	/**
	 * Avoir le numéro de série
	 *
	 * @return the serial Number
	 */
	public String getSerial();

	/**
	 * Allume le capteur :
	 */
	public void turnOn();

	/**
	 * Eteint le capteur :
	 */
	public void turnOff();

}
