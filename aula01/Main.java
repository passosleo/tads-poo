public class Main {
  public static void exercicio1() {
    int numero = 2;
    int resto = 10 % numero;

    if (resto == 0) {
      System.out.println("Par");
    } else {
      System.out.println("Impar");
    }
  }

  public static void exercicio2() {
    int dia = 19;
    int mes = 2;
    int ano = 2024;

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
  }

  public static void main(String[] args) {
    exercicio1();
    exercicio2();
  }
}
