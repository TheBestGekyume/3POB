package controle;

import java.util.Scanner;
import dominio.Produto;

public class controlaProduto {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite o numero: ");
      int numero = scanner.nextInt();
      System.out.print("Digite a quantidade: ");
      int quantidade = scanner.nextInt();
      System.out.print("Digite o valor: ");
      double valor = scanner.nextDouble();

      Produto produto = new Produto(numero, quantidade, valor);
      int codigo = produto.getNumero();
      System.out.println("Total: R$" + produto.valorPagar());
      System.out.print("Codigo do Produto: " + codigo);
      
      scanner.close();
   }

}