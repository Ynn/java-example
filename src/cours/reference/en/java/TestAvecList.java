package cours.reference.en.java;

import java.util.ArrayList;
import java.util.List;

public class TestAvecList {

	public static void videLaListe(List<Integer> list) {
		list.clear();
	}

	public static void ajoute5(List<Integer> list) {
		for (Integer i : list) {
			i = i + 5;
		}
	}

	public static void ajoute5(ArrayList<Integer> list) {
		for (int index = 0; index < list.size(); index++) {
			list.set(index, list.get(index) + 5);
		}
	}

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(3);
		l.add(4);

		ajoute5(l);
		System.out.println(l);

		ajoute5((ArrayList<Integer>) l);
		System.out.println(l);

		videLaListe(l);
		System.out.println(l);

	}

}
