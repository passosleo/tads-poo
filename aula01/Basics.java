public class Basics {
  public static void main(String[] args) {
    // Tipos
    String texto = "texto";
    System.out.println("\n Texto: " + texto);

    int idade = 26;
    System.out.printf("\n Idade: %d", idade);

    float peso = 70.5f;
    System.out.printf("\n Peso: %f", peso);
    System.out.printf("\n Peso: %.2f", peso);

    char sexo = 'M';
    System.out.printf("\n Sexo: %c", sexo);

    System.out.printf("\n Texto: %s \n Idade: %d \n Peso: %.2f \n Sexo: %c", texto, idade, peso, sexo);

    // Operadores matemáticos
    int soma = 10 + 20;
    int subtracao = 20 - 10;
    int multiplicacao = 10 * 20;
    float divisao = (float) 10 / 20;
    int resto = 10 % 3;

    System.out.println("\n Soma: " + soma);
    System.out.println("\n Subtracao: " + subtracao);
    System.out.println("\n Multiplicacao: " + multiplicacao);
    System.out.println("\n Divisao: " + divisao);
    System.out.println("\n Divisao: " + resto);

    int id = 18;

    if (id >= 18) {
      System.out.println("Maior ou igual a 18");
    } else {
      System.out.println("Menor de 18");
    }
  }
}
