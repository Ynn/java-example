package cours.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void testInteger() {
		Integer i1 = new Integer(3);
		Integer i2 = new Integer(3);
		Integer i3 = i1;
		System.out.println(i1 == i2);
		System.out.println(i1 == i3);
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));

	}

	public static void testString() {
		String s1 = new String("Toto");
		String s2 = new String("Toto");
		String s3 = s1;
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

	public static void main(String[] args) {
		testInteger();
		System.out.println("---");
		testString();
	}

}
