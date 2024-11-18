package lista5.Exercicio5L5;

import lista5.Exercicio5L5.dominio.PessoaFisica;
import lista5.Exercicio5L5.dominio.PessoaJuridica;

public class ControleCliente {
       public static void main(String[] args) {
        // Criando um objeto PessoaFisica
        PessoaFisica pf = new PessoaFisica("Rua A, 123", "1234-5678", "123.456.789-00", "João da Silva");
        System.out.println("Dados da Pessoa Física:");
        pf.exibirDados();

        System.out.println();

        // Criando um objeto PessoaJuridica
        PessoaJuridica pj = new PessoaJuridica("Avenida B, 456", "9876-5432", "12.345.678/0001-99", "Empresa XYZ LTDA");
        System.out.println("Dados da Pessoa Jurídica:");
        pj.exibirDados();
    }
}
