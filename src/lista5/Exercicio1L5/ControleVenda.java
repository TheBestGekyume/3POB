package lista5.Exercicio1L5;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ControleVenda {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");  // Instância de DecimalFormat para formatar os valores

        // Entrada dos dados da venda
        System.out.print("Digite o número da venda: ");
        int numero = sc.nextInt();

        System.out.print("Digite a quantidade de produtos: ");
        int quantidade = sc.nextInt();

        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = sc.nextDouble();

        // Criando o objeto VendaProduto com os dados inseridos
        DominioVenda venda = new DominioVenda(numero, quantidade, valorUnitario);

        // Exibindo os dados da venda com formatação via DecimalFormat
        System.out.println("\nDados da venda:");
        System.out.println("Número da venda: " + venda.getNumero());
        System.out.println("Quantidade de produtos: " + venda.getQuantidade());
        System.out.println("Valor unitário: R$ " + df.format(venda.getValorUnitario()));
        System.out.println("Valor total a pagar: R$ " + df.format(venda.valorPagar()));

        sc.close();  // Fechar o Scanner após o uso
    }
    
}
