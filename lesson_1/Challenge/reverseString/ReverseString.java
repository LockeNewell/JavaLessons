package lesson_1.Challenge.reverseString;

import java.util.Scanner;

public class ReverseString {

  public static String reverseString(String input) {
    char[] charArray = input.toCharArray();
    int left = 0;
    int right = charArray.length - 1;

    while (left < right) {
      char temp = charArray[left];
      charArray[left] = charArray[right];
      charArray[right] = temp;

      left++;
      right--;
    }
    return new String(charArray);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter a string to reverse:");
    String input = scanner.nextLine();
    String output = reverseString(input);
    System.out.println("the string to reverse:");
    System.out.println(output);

    scanner.close();
  }
}