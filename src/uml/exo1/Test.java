package uml.exo1;

public class Test {

  public static void main(String[] args) {
    Personne marie = new Personne("Marie");
    for (int i = 0; i < 33; i++) {
      marie.vieillir();
    }

    Personne paul = new Personne("Paul");
    paul.setAge(27);

    System.out.println(paul.toString());
    System.out.println(marie.toString());

  }

}
