package dominio;

public class Produto {
   private int numero;
   private int quantidade;
   private double valorUnitario;
   
   public Produto(int numero, int quantidade, double valorUnitario) {
       super();
       this.numero = numero;
       this.quantidade = quantidade;
       this.valorUnitario = valorUnitario;
   }

   public int getNumero() {
       return numero;
   }

   public void setNumero(int numero) {
       this.numero = numero;
   }

   public int getQuantidade() {
       return quantidade;
   }

   public void setQuantidade(int quantidade) {
       this.quantidade = quantidade;
   }

   public double getValorUnitario() {
       return valorUnitario;
   }

   public void setValorUnitario(double valorUnitario) {
       this.valorUnitario = valorUnitario;
   }

   public double valorPagar() {
       return quantidade * valorUnitario;
   }

}