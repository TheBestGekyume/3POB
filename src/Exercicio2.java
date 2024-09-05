import java.util.Scanner;
public class Exercicio2 {

    /*2.  Crie um programa para solicitar o ano atual e o ano de nascimento de uma pessoa.
     Calcular sua idade aproximada e informá-la. Se sua idade for inferior a 16 anos,
     escrever a mensagem "Não pode votar"; caso contrário, emitir a mensagem "É eleitor". */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();
        
        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual-anoNascimento;

        if(idade > 16){
            System.out.print("Você tem aproximadamente " + idade + " anos. Você é eleitor!");
        }else{
            System.out.print("Você tem aproximadamente " + idade + " anos. Você não pode votar!");
        }

    }
}