package exemple.heritage.et.itf;

public interface ICapteur {

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
	 * Retourne le nom de la piece dans lequel est le capteur
	 *
	 * @return nom de la piece
	 */
	public String getLocation();

	/**
	 * Allume le capteur :
	 */
	public void turnOn();

	/**
	 * Eteint le capteur :
	 */
	public void turnOff();

	/**
	 * Allume si éteint, éteint si allumé
	 */
	public void switchState();

}
