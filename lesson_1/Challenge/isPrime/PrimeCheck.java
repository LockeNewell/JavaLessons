package lesson_1.Challenge.isPrime;

import java.util.Scanner;

public class PrimeCheck {
  public static boolean isPrime(int number) {
    if (number < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("enter a number to check if it is prime: ");

    if (isPrime(scanner.nextInt())) {
      System.out.println("It is Prime");
    } else {
      System.out.println("It is not Prime.");
    }

    scanner.close();

  }
}