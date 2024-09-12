package ListaEx3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio11 {
    // 11. Um determinado material radioativo perde metade de sua massa a cada 50
    // segundos.
    // Dada a massa inicial, em gramas, fazer um algoritmo que determine o tempo
    // necessário
    // para que essa massa se torne menor do que 0.5 gramas. Escreva a massa final,
    // e o tempo.
    // Observação: o usuário deve digitar a massa inicial.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int tempo = 0;

        System.out.print("Digite a massa inicial em gramas: ");

        double massaAtual = scanner.nextDouble();

        while (massaAtual > 0.5) {
            tempo += 50;
            massaAtual /= 2;
        }

        System.out.println("Tempo de decaimento = " + tempo + " segundos");
        System.out.print("Massa Final = " + df.format(massaAtual) + " gramas");

        scanner.close();

    }

}
