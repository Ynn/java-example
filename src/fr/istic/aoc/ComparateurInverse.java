package fr.istic.aoc;

import java.util.Comparator;

public final class ComparateurInverse implements Comparator<Integer> {
  @Override
  public int compare(Integer n1, Integer n2) {
    return -n1.compareTo(n2);
  }
}