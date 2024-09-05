import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite a matrícula do primeiro empregado: ");
        int matricula1 = scanner.nextInt();
        System.out.print("Digite o salário do primeiro empregado: ");
        double salario1 = scanner.nextDouble();

        System.out.print("Digite a matrícula do segundo empregado: ");
        int matricula2 = scanner.nextInt();
        System.out.print("Digite o salário do segundo empregado: ");
        double salario2 = scanner.nextDouble();

        double desconto = salario1 * 0.05;
        double acrescimo = salario2 * 0.09;

        double salarioFinal1 = salario1 - desconto;
        double salarioFinal2 = salario2 + acrescimo;

        System.out.println("Valor do desconto do empregado " + matricula1 + ": " + df.format(desconto));
        System.out.println("Valor do acréscimo do empregado " + matricula2 + ": " + df.format(acrescimo));
        System.out.println("Salário final do empregado " + matricula1 + ": " + df.format(salarioFinal1));
        System.out.println("Salário final do empregado " + matricula2 + ": " + df.format(salarioFinal2));
    }
}