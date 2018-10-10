package uml.exo1;

import java.util.List;

public class Test {

  public static void main(String[] args) {
    Personne marie = new Personne("Marie");
    for (int i = 0; i < 33; i++) {
      marie.vieillir();
    }

    Personne paul = new Personne("Paul");
    paul.setAge(27);

    Personne georgette = paul.faireEnfantAvec(marie, "Georgette");

    System.out.println(paul.toString());
    System.out.println(marie.toString());
    System.out.println(georgette);

    System.out.println("Les parents de georgettes sont :");
    List<Personne> parents = georgette.getParents();
    for (Personne p : parents) {
      System.out.println(p.getNom());
    }
  }
}
