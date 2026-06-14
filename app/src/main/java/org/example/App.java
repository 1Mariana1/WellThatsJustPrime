package org.example;

public class App {
  public static void main(String[] args) {
    // Test your Factorizer class using a driver program here!
    Factorizer factorizer = new Factorizer();

    System.out.println(factorizer.primeFactors(0));
    System.out.println(factorizer.primeFactors(1));
    System.out.println(factorizer.primeFactors(9));
    System.out.println(factorizer.primeFactors(10));
    System.out.println(factorizer.primeFactors(12));
    System.out.println(factorizer.primeFactors(30));

  }
}
