package AV2.exercicioArquivo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HospitalController {
    private static final String ARQUIVO = "pacientes.txt";


    // Método para adicionar um paciente
    public void adicionarPaciente(int numero, String nome, double peso, double altura) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            Paciente novoPaciente = new Paciente(numero, nome, peso, altura);
            bw.write(novoPaciente.toString());
            bw.newLine();
            System.out.println("Paciente adicionado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao adicionar paciente: " + e.getMessage());
        }
    }

    // Método para alterar dados de um paciente
    public void alterarPaciente(int numero, String novoNome, double novoPeso, double novaAltura) {
        List<Paciente> pacientes = carregarPacientes();

        boolean pacienteAlterado = false;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Paciente paciente : pacientes) {
                if (paciente.getNumero() == numero) {
                    paciente.setNome(novoNome);
                    paciente.setPeso(novoPeso);
                    paciente.setAltura(novaAltura);
                    pacienteAlterado = true;
                }
                bw.write(paciente.toString());
                bw.newLine();
            }

            if (pacienteAlterado) {
                System.out.println("Dados do paciente atualizados com sucesso!");
            } else {
                System.out.println("Paciente não encontrado.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao alterar paciente: " + e.getMessage());
        }
    }

    // Método para excluir um paciente
    public void excluirPaciente(int numero) {
        List<Paciente> pacientes = carregarPacientes();
        boolean pacienteExcluido = false;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Paciente paciente : pacientes) {
                if (paciente.getNumero() == numero) {
                    pacienteExcluido = true;
                    continue; // Não escrever o paciente excluído
                }
                bw.write(paciente.toString());
                bw.newLine();
            }

            if (pacienteExcluido) {
                System.out.println("Paciente excluído com sucesso!");
            } else {
                System.out.println("Paciente não encontrado.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao excluir paciente: " + e.getMessage());
        }
    }

    // Método para listar todos os pacientes
    public void listarTodosPacientes() {
        List<Paciente> pacientes = carregarPacientes();

        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
            return;
        }

        System.out.println("Lista de Pacientes:");
        for (Paciente paciente : pacientes) {
            paciente.listarPaciente();
        }
    }

    // Método para buscar um paciente por número
    public void buscarPaciente(int numero) {
        List<Paciente> pacientes = carregarPacientes();

        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                System.out.println("Paciente encontrado:");
                paciente.listarPaciente();
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    // Método para carregar todos os pacientes do arquivo
    private List<Paciente> carregarPacientes() {
        List<Paciente> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                lista.add(Paciente.fromString(linha));
            }
        } catch (FileNotFoundException e) {
            // Arquivo ainda não existe, retorna lista vazia
        } catch (IOException e) {
            System.out.println("Erro ao carregar os dados: " + e.getMessage());
        }
        return lista;
    }
}
