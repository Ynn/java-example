package exemple.heritage.et.itf;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void testCapteurs(Collection<Capteur> capteurs) {
		for (Capteur capteur : capteurs) {
			afficherCapteur(capteur);
		}
	}

	public static void afficherCapteur(Capteur c) {
		System.out.println(c.getSerial());
		System.out.println(c.isOn());
		c.turnOn();
		System.out.println(c.isOn());
		System.out.println(c.getSerial());
		System.out.println("--------------");
	}

	public static void main(String[] args) {

		Collection<Capteur> capteurs = new ArrayList<>();
		capteurs.add(new LampeConstructeur2("AXME90E-Z45"));
		capteurs.add(new LampeConstructeur1());
		capteurs.add(new CapteurTemperature());
		capteurs.add(new CapteurPression());

		testCapteurs(capteurs);
	}
}
