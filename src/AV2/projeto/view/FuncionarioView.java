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
                case 2 -> listarFuncionarios();
                case 3 -> atualizarFuncionario();
                case 4 -> removerFuncionario();
                case 5 -> System.out.println("\nObrigado por usar o sistema. Até mais!");
                default -> System.out.println("\n Opção inválida. Tente novamente.");
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

    private void listarFuncionarios() {
        System.out.println("\n--- Lista de Funcionários ---");
        if (controller.funcionariosVazios()) {
            System.out.println(" Nenhum funcionário cadastrado.");
            return;
        }
        controller.listarFuncionarios();
        
        int id = lerInteiro("\nDigite o ID do funcionário para executar um método específico (0 para voltar): ");
        if (id == 0) return;

        Funcionario funcionario = controller.getFuncionarioPorId(id);
        if (funcionario != null) {
            executarMetodoFuncionario(funcionario);
        } else {
            System.out.println(" Funcionário não encontrado.");
        }
    }

    private void executarMetodoFuncionario(Funcionario funcionario) {
        if (funcionario instanceof Desenvolvedor) {
            System.out.println("\nEscolha uma ação para o Desenvolvedor:");
            System.out.println("1 - Codar");
            System.out.println("2 - Resolver Problemas");
            System.out.println("3 - Receber Aumento de Salário");
            int opcao = lerInteiro("Sua escolha: ");
            switch (opcao) {
                case 1 -> ((Desenvolvedor) funcionario).codar();
                case 2 -> ((Desenvolvedor) funcionario).resolverProblemas();
                case 3 -> {
                    double aumento = lerDouble("Digite o valor do aumento: ");
                    funcionario.receberAumento(aumento);
                    System.out.println("Aumento aplicado. Novo salário: " + funcionario.getSalario());
                }
                default -> System.out.println("Opção inválida.");
            }
        } else if (funcionario instanceof Gerente) {
            System.out.println("\nEscolha uma ação para o Gerente:");
            System.out.println("1 - Organizar Equipe");
            System.out.println("2 - Conduzir Reuniões");
            System.out.println("3 - Receber Aumento de Salário");
            int opcao = lerInteiro("Sua escolha: ");
            switch (opcao) {
                case 1 -> ((Gerente) funcionario).organizarEquipe();
                case 2 -> ((Gerente) funcionario).conduzirReunioes();
                case 3 -> {
                    double aumento = lerDouble("Digite o valor do aumento: ");
                    funcionario.receberAumento(aumento);
                    System.out.println("Aumento aplicado. Novo salário: " + funcionario.getSalario());
                }
                default -> System.out.println("Opção inválida.");
            }
        } else if (funcionario instanceof Treinador) {
            System.out.println("\nEscolha uma ação para o Treinador:");
            System.out.println("1 - Ensinar Tecnologia");
            System.out.println("2 - Motivar Equipe");
            System.out.println("3 - Receber Aumento de Salário");
            int opcao = lerInteiro("Sua escolha: ");
            switch (opcao) {
                case 1 -> ((Treinador) funcionario).ensinarTecnologia();
                case 2 -> ((Treinador) funcionario).motivarEquipe();
                case 3 -> {
                    double aumento = lerDouble("Digite o valor do aumento: ");
                    funcionario.receberAumento(aumento);
                    System.out.println("Aumento aplicado. Novo salário: " + funcionario.getSalario());
                }
                default -> System.out.println("Opção inválida.");
            }
        } else if (funcionario instanceof GerenteDesenvolvedor) {
            System.out.println("\nEscolha uma ação para o Gerente Desenvolvedor:");
            System.out.println("1 - Codar");
            System.out.println("2 - Resolver Problemas");
            System.out.println("3 - Organizar Equipe");
            System.out.println("4 - Conduzir Reuniões");
            System.out.println("5 - Receber Aumento de Salário");
            int opcao = lerInteiro("Sua escolha: ");
            switch (opcao) {
                case 1 -> ((GerenteDesenvolvedor) funcionario).codar();
                case 2 -> ((GerenteDesenvolvedor) funcionario).resolverProblemas();
                case 3 -> ((GerenteDesenvolvedor) funcionario).organizarEquipe();
                case 4 -> ((GerenteDesenvolvedor) funcionario).conduzirReunioes();
                case 5 -> {
                    double aumento = lerDouble("Digite o valor do aumento: ");
                    funcionario.receberAumento(aumento);
                    System.out.println("Aumento aplicado. Novo salário: " + funcionario.getSalario());
                }
                default -> System.out.println("Opção inválida.");
            }
        }
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
            System.out.println(" Tipo de funcionário inválido. Operação cancelada.");
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
            System.out.println("\n Funcionário cadastrado com sucesso!");
        }
    }

    private void atualizarFuncionario() {
        System.out.println("\n--- Atualização de Funcionário ---");
        int id = lerInteiro("Digite o ID do funcionário a ser atualizado: ");
        String novoNome = lerTexto("Digite o novo nome do funcionário: ");
        double novoSalario = lerDouble("Digite o novo salário do funcionário: ");

        controller.atualizarFuncionario(id, novoNome, novoSalario);
        System.out.println("\n Dados do funcionário atualizados com sucesso!");
    }

    private void removerFuncionario() {
        System.out.println("\n--- Remoção de Funcionário ---");
        int id = lerInteiro("Digite o ID do funcionário a ser removido: ");

        controller.removerFuncionario(id);
    }

    private int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println(" Entrada inválida. Digite um número inteiro.");
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
            System.out.println(" Entrada inválida. Digite um número decimal.");
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
