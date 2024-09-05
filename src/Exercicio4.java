import java.util.Scanner;
import java.text.DecimalFormat;


public class Exercicio4 {
    /*
    4. Elabore um programa para solicitar o nome, o sexo e o salário 
    bruto de um empregado. Se o seu sexo for masculino, descontar 5% de seu salário;
    caso contrário, descontar 3%. Informar o valor do desconto e o salário líquido.
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");


        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu sexo: ");
        String sexo = scanner.nextLine();

        System.out.print("Digite o sua salário: ");
        double salario = scanner.nextDouble();

        if(sexo.equals("masculino")){
            salario *= 0.95;
        }else if(sexo.equals("feminino")){
            salario *= 0.97;
        }else{
            System.out.print("ERROR");
        }

        System.out.print("O seu salário líquido é " + df.format(salario));
    }
}