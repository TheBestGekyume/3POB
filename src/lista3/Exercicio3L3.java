    package lista3;
    import java.util.Scanner;

    public class Exercicio3L3 {

        // 3.  Faça um programa que leia a idade de 10 pessoas. Ao final escreva a média das idades.

        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);

            int[] idades = new int[10];
            int somaIdades = 0;

            for (int i = 0; i < idades.length; i++) {
                System.out.printf("Digite a idade " + (i + 1) + ": ");
                idades[i] = scanner.nextInt();

                somaIdades += idades[i];
            }

            int mediaIdades = somaIdades / idades.length;

            System.out.print("A media de todas as idades é " + mediaIdades);

            scanner.close();

        }
    }
