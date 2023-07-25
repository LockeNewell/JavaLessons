package lesson_1.Exercise.findLargest;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FindLargest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a comma separated list of integers:");
    List<Integer> numList = new ArrayList<>();
    int largest = Integer.MIN_VALUE;
    String[] inputList = scanner.nextLine().split(",");
    for (String input : inputList) {
      numList.add(Integer.parseInt(input));
    }
    for (Integer num : numList) {
      largest = (num > largest) ? num : largest;
    }
    System.out.println("the largest integer is:" + largest);

    scanner.close();
  }
}
