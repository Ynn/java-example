package cours.reference.en.java;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void testPrimitif() {
		System.out.println("Primitif");
		int a = 5;
		int b = a;
		a = a + 5;
		b = b - 5;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	public static void test1AvecList() {
		System.out.println("Test 1");
		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();
		a.add("Toto");
		b.add("Toto");
		b.clear();
		// que vaut l'affichage :
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void test2AvecList() {
		System.out.println("Test 2");
		List<String> a = new ArrayList<String>();
		List<String> b = a;
		a.add("Toto");
		b.add("Toto");
		System.out.println("taille a = " + a.size());
		System.out.println("taille b = " + b.size());
		System.out.println("on vide b");
		b.clear();
		// que vaut l'affichage :
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public static void main(String[] args) {
		testPrimitif();
		test1AvecList();
		test2AvecList();

	}

}
