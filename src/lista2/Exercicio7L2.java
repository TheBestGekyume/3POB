package lista2;
import java.util.Scanner;

public class Exercicio7L2 {
    // 7. Elabore um programa que leia três números diferentes e informe o maior
    // deles.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int n3 = scanner.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.print(n1 + " é o maior numero");
        } else if (n2 >= n3) {
            System.out.print(n2 + " é o maior numero");
        } else {
            System.out.print(n3 + " é o maior numero");
        }
        scanner.close();
    }
}
