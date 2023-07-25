package lesson_1.Challenge.factorial;

import java.util.Scanner;

public class FactorialCalculator {

  public static int factorial(int number) {
    if (number == 0 || number == 1) {
      return 1;
    }
    return number * factorial(number - 1);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("give a number for which I will find a factorial: ");
    int number = scanner.nextInt();
    System.out.println(number + "! = " + factorial(number));

    scanner.close();
  }

}
