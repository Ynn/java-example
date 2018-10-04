package fr.istic.aoc;

public class ExampleRecursive {

  static int somme(int n) {
    if (n > 0) {
      return n + somme(n - 1);
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    System.out.println(somme(2));
  }

}
