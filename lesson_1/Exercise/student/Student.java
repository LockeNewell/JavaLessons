package lesson_1.Exercise.student;

public class Student {
  private String name;
  private int age;
  private String grade;

  public Student(String name, int age, String grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
  }

  public void display() {
    System.out.println("name:" + name);
    System.out.println("age:" + age);
    System.out.println("grade:" + grade);
  }

}
