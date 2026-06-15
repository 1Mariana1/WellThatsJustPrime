package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorizerTest {

  @Test
  void itReturnsAnEmptyListForNegativeThirty() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(0));
  }

  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(0));
  }

  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<Integer>(), factorizer.primeFactors(1));
  }

  @Test
  void itReturnsPrimeFactorsForNine() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(Arrays.asList(3, 3)), factorizer.primeFactors(9));
  }

  @Test
  void itReturnsPrimeFactorsForTen() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(Arrays.asList(2, 5)), factorizer.primeFactors(10));
  }

  @Test
  void itReturnsPrimeFactorsForTwelve() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(Arrays.asList(2, 2, 3)), factorizer.primeFactors(12));
  }

  @Test
  void itReturnsPrimeFactorsForThirty() {
    Factorizer factorizer = new Factorizer();
    assertEquals(new ArrayList<>(Arrays.asList(2, 3, 5)), factorizer.primeFactors(30));
  }

}
