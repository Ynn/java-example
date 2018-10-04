package fr.istic.aoc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Test {

  /** The name of the dog. */
  public static String nameOfTheDog = "Rex";

  /**
   * The main method. Ma super méthode statique main
   * 
   * @param args
   *          the arguments
   */
  public static void main(String[] args) {
    Integer tableau[] = new Integer[] { 1, 2, 46, 57, 36, 3, 4 };

    Comparator c = new ComparateurInverse();

    Arrays.sort(tableau, c);

    for (int indice = 0; indice < tableau.length; indice++) {
      System.out.println(tableau[indice]);
    }

  }

}
