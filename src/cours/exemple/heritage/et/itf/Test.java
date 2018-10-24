package cours.exemple.heritage.et.itf;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void testCapteurs(Collection<ICapteur> capteurs) {
		for (ICapteur capteur : capteurs) {
			System.out.println("--------------");
			System.out.println(capteur.getLocation());
			System.out.println("Mon capteur est de la classe : " + capteur.getClass());
			testerCapteur(capteur);
			if (capteur instanceof ICapteurTemperature) {
				// J'ai oublié le cast :
				// System.out.println("Valeur actuelle : " + capteur.getValue());
				System.out.println("temperature : " + ((ICapteurTemperature) capteur).getTemperature() + "°C");
			}

			if (capteur instanceof ICapteurPression) {
				// J'ai oublié le cast :
				// System.out.println("Valeur actuelle : " + capteur.getValue());
				System.out.println("pression : " + ((ICapteurPression) capteur).getPression() + "bar");
			}

			if (capteur instanceof ICapteurSurBatterie) {
				// J'ai oublié le cast :
				// System.out.println("Valeur actuelle : " + capteur.getValue());
				System.out.println("batterie : " + ((ICapteurSurBatterie) capteur).getNiveauBat() + "%");
			}

			System.out.println("   ");
		}
	}

	public static void testerCapteur(ICapteur c) {
		System.out.println(c.getSerial());
		// Commence par éteindre
		c.turnOff();
		// Inverse l'état
		c.switchState();
		// Affiche l'état :
		System.out.println(c.isOn());
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
