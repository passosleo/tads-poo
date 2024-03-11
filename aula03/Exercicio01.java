package aula03;

public class Exercicio01 {
  public static void main(String[] args) {
    String divideByThree = "Fizz";
    String divideByFive = "Buzz";

    for (int i = 1; i <= 500; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.printf("%s\n", (divideByThree + divideByFive));
      } else if (i % 3 == 0) {
        System.out.printf("%s\n", divideByThree);
      } else if (i % 5 == 0) {
        System.out.printf("%s\n", divideByFive);
      } else {
        System.out.printf("%d\n", i);
      }
    }
  }
}
