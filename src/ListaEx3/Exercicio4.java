package ListaEx3;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 0;
        int masculino = 0;
        int feminino = 0;
        char opc = ' ';

        System.out.println("Digite o sexo dos funcionarios:");
        System.out.println("M - Masculino\nF - Feminino\nS - Sair");

        // O loop continua até o usuário digitar 'S' ou 's'
        while (opc != 'S' && opc != 's') {
            System.out.print(">");
            opc = scanner.next().charAt(0);

            if (opc == 'M' || opc == 'm') {
                masculino++;
                totalPessoas++;
            } else if (opc == 'F' || opc == 'f') {
                feminino++;
                totalPessoas++;
            } else if (opc != 'S' && opc != 's') {
                System.out.println("Opção inválida! Digite 'M', 'F' ou 'S'.");
            }
        }

        // Exibe os resultados ao final
        System.out.println("\nTotal de pessoas cadastradas: " + totalPessoas);
        System.out.println("Total de pessoas do sexo masculino: " + masculino);
        System.out.println("Total de pessoas do sexo feminino: " + feminino);

        scanner.close();
    }
}
