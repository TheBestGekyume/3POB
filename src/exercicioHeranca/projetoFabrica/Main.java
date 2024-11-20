package exercicioHeranca.projetoFabrica;

import exercicioHeranca.projetoFabrica.controle.ClienteController;
import exercicioHeranca.projetoFabrica.dominio.PessoaFisica;

public class Main {
    public static void main(String[] args) {
        ClienteController controller = new ClienteController();

        // Adicionando clientes
        controller.adicionarPessoaFisica("Rua A", "123456789", "123.456.789-00", "João Silva");
        controller.adicionarPessoaJuridica("Avenida B", "987654321", "12.345.678/0001-00", "Empresa XYZ");

        // Listando clientes
        controller.listarClientes();

        // Buscando cliente pelo CPF
        PessoaFisica pf = controller.buscarPessoaFisicaPorCpf("123.456.789-00");
        if (pf != null) {
            System.out.println("Pessoa Física encontrada: " + pf.getNome());
        }

        // Removendo cliente
        controller.removerPessoaFisicaPorCpf("123.456.789-00");

        // Listando novamente
        controller.listarClientes();
    }
}
