public class Exercicio05 {
  public static void main(String[] args) {
    int chicoHeight = 80;
    int chicoGrowth = 6;
    
    int jucaHeight = 60;
    int jucaGrowth = 9;
    
    int amountYears = 0;
    
    do {
      amountYears++;
      chicoHeight = chicoHeight + chicoGrowth;
      jucaHeight = jucaHeight + jucaGrowth;
    } while (jucaHeight <= chicoHeight);

    System.out.printf("Altura do Chico: %.2f m\n", (float)chicoHeight/100);
    System.out.printf("Altura do Juca: %.2f m\n", (float)jucaHeight/100);
    System.out.printf("Qtd anos: %d\n", amountYears);
  }
}
