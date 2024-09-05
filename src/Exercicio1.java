import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

    /*1.  Faça um programa para solicitar o nome e a 
     idade de uma pessoa. Se sua idade for menor que 18 anos,
    escrever a mensagem: "É menor". */ 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        if(idade > 18){
            System.out.println("Ola " + nome + ", você é maior de idade");
        }else{
            System.out.println("Ola " + nome + ", você é menor de idade");
        }
      
    }
}