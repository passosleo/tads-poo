package aula02;

import java.util.Scanner;

public class Exercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a nota do aluno [1-10]: ");
    float nota = sc.nextFloat();

    if (nota >= 7) {
      System.out.println("Aprovado");
    } else if (nota >= 1.7 && nota < 7) {
      System.out.println("Exame");
    } else {
      System.out.println("Reprovado");
    }

    sc.close();
  }
}
