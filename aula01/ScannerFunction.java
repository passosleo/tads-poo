import java.util.Scanner;

public class ScannerFunction {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu nome: ");

    String nome = sc.nextLine();

    System.out.println("Seu nome é: " + nome);

    System.out.println("Digite sua idade: ");

    int idade = sc.nextInt();

    System.out.println("Sua idade é: " + idade);

    float peso = sc.nextFloat();

    System.out.println("Seu peso é: " + peso);

    sc.close();
  }
}
