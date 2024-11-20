package AV2.projeto.view;

import AV2.projeto.controller.FuncionarioController;
import AV2.projeto.model.Funcionario;
import AV2.projeto.model.classes.Desenvolvedor;
import AV2.projeto.model.classes.Gerente;
import AV2.projeto.model.classes.GerenteDesenvolvedor;
import AV2.projeto.model.classes.Treinador;
import java.util.Scanner;

public class FuncionarioView {
    private final FuncionarioController controller = new FuncionarioController();
    private final Scanner scanner = new Scanner(System.in);

    public void menu() {
        controller.carregarDados();
        int opcao;

        do {
            exibirMenuPrincipal();
            opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> cadastrarFuncionario();
                case 2 -> controller.listarFuncionarios();
                case 3 -> atualizarFuncionario();
                case 4 -> removerFuncionario();
                case 5 -> System.out.println("\nObrigado por usar o sistema. Até mais!");
                default -> System.out.println("\nOpção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private void exibirMenuPrincipal() {
        System.out.println("\n======= Sistema de Gerenciamento de Funcionários =======");
        System.out.println("1. Cadastrar Funcionário");
        System.out.println("2. Listar Funcionários");
        System.out.println("3. Atualizar Funcionário");
        System.out.println("4. Remover Funcionário");
        System.out.println("5. Sair");
        System.out.println("========================================================");
    }

    private void cadastrarFuncionario() {
        System.out.println("\n--- Cadastro de Funcionário ---");
        int tipo = lerInteiro("""
                Escolha o tipo de funcionário:
                1 - Desenvolvedor
                2 - Gerente
                3 - Treinador
                4 - Gerente Desenvolvedor
                Sua escolha: 
                """);

        if (tipo < 1 || tipo > 4) {
            System.out.println("Tipo de funcionário inválido. Operação cancelada.");
            return;
        }

        String nome = lerTexto("Digite o nome do funcionário: ");
        double salario = lerDouble("Digite o salário do funcionário: ");
        int id = lerInteiro("Digite o ID único do funcionário: ");

        Funcionario funcionario = switch (tipo) {
            case 1 -> new Desenvolvedor(id, nome, salario);
            case 2 -> new Gerente(id, nome, salario);
            case 3 -> new Treinador(id, nome, salario);
            case 4 -> new GerenteDesenvolvedor(id, nome, salario);
            default -> null; // Este caso nunca será alcançado devido à validação inicial.
        };

        if (funcionario != null) {
            controller.adicionarFuncionario(funcionario);
        }
    }

    private void atualizarFuncionario() {
        System.out.println("\n--- Atualização de Funcionário ---");
        int id = lerInteiro("Digite o ID do funcionário a ser atualizado: ");
        String novoNome = lerTexto("Digite o novo nome do funcionário: ");
        double novoSalario = lerDouble("Digite o novo salário do funcionário: ");

        controller.atualizarFuncionario(id, novoNome, novoSalario);
    }

    private void removerFuncionario() {
        System.out.println("\n--- Remoção de Funcionário ---");
        int id = lerInteiro("Digite o ID do funcionário a ser removido: ");
        controller.removerFuncionario(id);
    }

    private int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número inteiro.");
            scanner.nextLine();
            System.out.print(mensagem);
        }
        int valor = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        return valor;
    }

    private double lerDouble(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um número decimal.");
            scanner.nextLine();
            System.out.print(mensagem);
        }
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer
        return valor;
    }

    private String lerTexto(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine().trim();
    }
}