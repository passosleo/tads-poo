package aula03;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número para obter a tabuada: ");

    int input = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.printf("%dx%d = %d\n", input, i, (i * input));
    }

    sc.close();
  }
}
