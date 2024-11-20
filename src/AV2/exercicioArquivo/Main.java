package AV2.exercicioArquivo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HospitalController hospital = new HospitalController();
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n--- Sistema de Gestão de Pacientes ---");
            System.out.println("1. Adicionar Paciente");
            System.out.println("2. Alterar Paciente");
            System.out.println("3. Excluir Paciente");
            System.out.println("4. Listar Todos os Pacientes");
            System.out.println("5. Buscar Paciente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Número do Paciente: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    System.out.print("Nome do Paciente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Peso do Paciente: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura do Paciente: ");
                    double altura = scanner.nextDouble();
                    hospital.adicionarPaciente(numero, nome, peso, altura);
                    break;
                case 2:
                    System.out.print("Número do Paciente a ser alterado: ");
                    int numeroAlterar = scanner.nextInt();
                    scanner.nextLine(); // Consumir quebra de linha
                    System.out.print("Novo Nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo Peso: ");
                    double novoPeso = scanner.nextDouble();
                    System.out.print("Nova Altura: ");
                    double novaAltura = scanner.nextDouble();
                    hospital.alterarPaciente(numeroAlterar, novoNome, novoPeso, novaAltura);
                    break;
                case 3:
                    System.out.print("Número do Paciente a ser excluído: ");
                    int numeroExcluir = scanner.nextInt();
                    hospital.excluirPaciente(numeroExcluir);
                    break;
                case 4:
                    hospital.listarTodosPacientes();
                    break;
                case 5:
                    System.out.print("Número do Paciente a ser buscado: ");
                    int numeroBuscar = scanner.nextInt();
                    hospital.buscarPaciente(numeroBuscar);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
