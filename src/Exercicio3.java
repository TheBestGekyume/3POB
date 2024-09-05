import java.util.Scanner;

public class Exercicio3 {
    /*3.  Faça um programa para solicitar o nome e as duas notas e um aluno.
    Calcular sua média e informá-la. Se ela for inferior a 7, escrever "Reprovado”;
    caso contrário escrever "Aprovado" */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota da AV1: ");
        int av1 = scanner.nextInt();

        System.out.print("Digite a nota da AV2: ");
        int av2 = scanner.nextInt();


        int media = (av1+av2)/2;

        System.out.println("Ola" + nome + ", a média das suas notas é " + media + ".");

        if (media > 7) {
            System.out.println("Aprovado!");
        }else{
            System.out.print("Reprovado!");
        }

        
    }
}
