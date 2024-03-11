package aula02;

import java.util.Scanner;

public class Exercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o dia: ");
    int dia = sc.nextInt();

    System.out.println("Informe o mês: ");
    int mes = sc.nextInt();

    System.out.println("Informe o ano: ");
    int ano = sc.nextInt();

    String mesTexto = "";

    switch (mes) {
      case 1:
        mesTexto = "Janeiro";
        break;
      case 2:
        mesTexto = "Fevereiro";
        break;
      case 3:
        mesTexto = "Março";
        break;
      case 4:
        mesTexto = "Abril";
        break;
      case 5:
        mesTexto = "Maio";
        break;
      case 6:
        mesTexto = "Junho";
        break;
      case 7:
        mesTexto = "Julho";
        break;
      case 8:
        mesTexto = "Agosto";
        break;
      case 9:
        mesTexto = "Setembro";
        break;
      case 10:
        mesTexto = "Outubro";
        break;
      case 11:
        mesTexto = "Novembro";
        break;
      case 12:
        mesTexto = "Dezembro";
        break;
    }

    System.out.printf("Data: %d de %s de %d", dia, mesTexto, ano);

    sc.close();
  }
}
