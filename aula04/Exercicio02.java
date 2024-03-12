import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe a altura: ");
    float heigth = sc.nextFloat();

    System.out.println("Informe o peso: ");
    float weight = sc.nextFloat();

    float result = weight / (heigth * heigth);

    if (result < 18.5) {
      System.out.println("Magreza - Grau de Obesidade 0");
    } else if (result >= 18.5 && result <= 24.9) {
      System.out.println("Normal - Grau de Obesidade 0");
    } else if (result >= 25.0 && result <= 29.9) {
      System.out.println("Sobrepeso - Grau de Obesidade I");
    } else if (result >= 30.0 && result <= 39.9) {
      System.out.println("Obesidade - Grau de Obesidade II");
    } else if (result >= 40.0) {
      System.out.println("Obesidade Grave - Grau de Obesidade III");
    }

    sc.close();
  }
}
