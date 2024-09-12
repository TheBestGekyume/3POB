package ListaEx3;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Exercicio1 {

    // 1.  Faça um programa que leia o preço de 10 produtos. Ao final escreva o somatório dos preços.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        double[] produtos = new double[10];
        double precoTotal = 0;

        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Digite o preço do produto " + (i + 1) + ": ");
            produtos[i] = scanner.nextDouble();

            precoTotal += produtos[i];
        }

        System.out.print("Total = R$" + df.format(precoTotal));

        scanner.close();
        

        
    }
}
