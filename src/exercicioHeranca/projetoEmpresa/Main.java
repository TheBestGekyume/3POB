package exercicioHeranca.projetoEmpresa;

import exercicioHeranca.projetoEmpresa.controle.EmpresaController;

public class Main {
    public static void main(String[] args) {
        EmpresaController controller = new EmpresaController();

        // Adicionando funcionários
        controller.adicionarFuncionario("001", "123.456.789-00", "João", 3000f);
        controller.adicionarGerente("002", "987.654.321-00", "Maria", 5000f, 1000f);
        controller.adicionarVendas("003", "456.123.789-00", "Carlos", 4000f, 800f, 500f);

        // Listando funcionários
        controller.listarFuncionarios();
    }
}

