package lista3;

public class Exercicio2L3 {
    //2.  Faça um programa que calcule e escreva no vídeo o somatório dos números inteiros de 1 até 50.
    public static void main(String[] args) {
        
        int contador = 0;

        for (int i = 1; i <= 50; i++) {
            contador += i;
        }

        System.out.print(contador);
    }
    
}