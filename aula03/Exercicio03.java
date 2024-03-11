package aula03;

import java.util.Scanner;

public class Exercicio03 {
  public static boolean isValidNote(float note) {
    return note >= 0 && note <= 10;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int providedNotes = 0;

    System.out.println("Informe a primeira nota:");
    float n1 = sc.nextFloat();
    if (isValidNote(n1)) {
      providedNotes++;
    } else {
      n1 = 0;
    }

    System.out.println("Informe a segunda nota:");
    float n2 = sc.nextFloat();
    if (isValidNote(n2)) {
      providedNotes++;
    } else {
      n2 = 0;
    }

    System.out.println("Informe a terceira nota:");
    float n3 = sc.nextFloat();
    if (isValidNote(n3)) {
      providedNotes++;
    } else {
      n3 = 0;
    }

    float mid = (n1 + n2 + n3) / providedNotes;

    System.out.printf("Foram lidas %d notas. A média é %.2f", providedNotes, mid);

    sc.close();
  }
}
