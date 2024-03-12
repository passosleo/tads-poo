import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a altura: ");
    float heigth = sc.nextFloat();

    System.out.println("Informe o sexo: ");
    String gender = sc.next();

    if (gender.equals("M") || gender.equals("m")) {
      System.out.printf("O peso ideal é %.2f", (72.7 * heigth) - 58);
    } else if (gender.equals("F") || gender.equals("f")) {
      System.out.printf("O peso ideal é %.2f", (62.1 * heigth) - 44.7);
    } else {
      System.out.println("Sexo inválido");
    }

    sc.close();
  }
}
