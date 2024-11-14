package lista2;
import java.util.Scanner;

public class Exercicio8L2 {

    // 8. Faça um programa que leia o código, a quantidade,
    // o preço unitário e a forma de pagamento
    // (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito)
    // de um produto. Pagamentos em dinheiro recebem um desconto de 10%,
    // em cartão de débito 5%, em cartão de crédito 3% e em cheque 2%.
    // O programa deve informar o valor do desconto e o valor final a pagar.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite a quantidade de produto(s): ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o preço unitário do produto: ");
        double preco = scanner.nextDouble();
        System.out.println("Digite o forma de pagamento:");
        System.out.println("1 - Dinheiro\t2 - Cheque\t3 - Cartão débito\t4 - Cartão crédito");
        int formaDePagamento = scanner.nextInt();

        preco *= quantidade;
        
        switch (formaDePagamento) {
            case 1:
                preco *= 0.9;
                break;

            case 2:
                preco *= 0.98;
                break;

            case 3:
                preco *= 0.95;
                break;

            case 4:
                preco *= 0.97;
                break;

            default:
                System.out.println("ERROR");
                break;
        }

        System.out.println("preco final:" + preco);

        scanner.close();

    }
    



}