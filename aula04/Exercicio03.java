import java.util.Scanner;

public class Exercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float value = 0;
    float sum = 0;
    
    do {
      System.out.println("Informe um número: ");
      value = sc.nextFloat();
      sum = sum + value;
      if(value != 0) {
        System.out.printf("Valor atual: %.2f \n\n", sum);
      }
    } while (value != 0);

    System.out.printf("Resultado final: %.2f \n\n", sum);

    sc.close();
  }
}
