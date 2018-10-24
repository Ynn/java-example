package exemple.heritage.itf.methode.object;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void testCapteurs(Collection<ICapteur> capteurs) {
		for (ICapteur capteur : capteurs) {
			System.out.println("--------------");
			System.out.println(capteur.toString());
			System.out.println();
			System.out.println("=== Test : ");

			// Eteint :
			capteur.turnOff();
			// Inverse l'état
			capteur.switchState();
			// Affiche l'état :
			System.out.println(capteur.isOn());
			System.out.println("");

		}
	}

	public static void afficherCapteur(ICapteur c) {
		System.out.println(c.getSerial());

	}

	public static void main(String[] args) {

		Collection<ICapteur> capteurs = new ArrayList<>();

		// Pour interdire la création de capteur vide,
		// j'indique que Capteur est abstrait dans la classe
		// Capteur
		// Capteur c = new Capteur();
		// capteurs.add(c);

		capteurs.add(new LampeKNX("Chambre"));
		capteurs.add(new LampePhilipsHue("Chambre"));
		capteurs.add(new CapteurTemperatureZigbee("Salon"));
		capteurs.add(new CapteurPressionKNX("Bathroom"));
		capteurs.add(new Meteo("Chambre"));
		capteurs.add(new MeteoSurBatterie("Chambre"));
		testCapteurs(capteurs);
	}
}
