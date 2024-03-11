package aula02;

import java.util.Scanner;

public class Exercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o numero 1: ");
    int number1 = sc.nextInt();

    System.out.println("Informe o numero 2: ");
    int number2 = sc.nextInt();

    System.out.println("Informe o numero 3: ");
    int number3 = sc.nextInt();

    if (number1 > number2 && number1 > number3) {
      System.out.println("O maior numero é: " + number1);
    } else if (number2 > number1 && number2 > number3) {
      System.out.println("O maior numero é: " + number2);
    } else {
      System.out.println("O maior numero é: " + number3);
    }

    sc.close();
  }
}
