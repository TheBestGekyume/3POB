package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11L3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int tempo = 0;
        double massaInicial;

        do {
            System.out.print("Digite a massa inicial em gramas (maior que 0.5g): ");
            massaInicial = scanner.nextDouble();

            if (massaInicial <= 0.5) {
                System.out.println("A massa inicial deve ser maior que 0.5 gramas.");
            }
        } while (massaInicial <= 0.5);

        double massaAtual = massaInicial;

        while (massaAtual > 0.5) {
            tempo += 50;
            massaAtual /= 2;
        }

        System.out.println("\nTempo necessário para a massa se tornar menor que 0.5g é " + tempo + " segundos");
        System.out.println("Massa final = " + df.format(massaAtual) + " gramas");

        scanner.close();
    }
}
