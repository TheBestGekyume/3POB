package AV2.exercicioArrayList;
import java.util.ArrayList;

public class HospitalController {
    private ArrayList<Paciente> pacientes;

    // Construtor
    public HospitalController() {
        this.pacientes = new ArrayList<>();
    }

    // Método para adicionar um paciente
    public void adicionarPaciente(int numero, String nome, double peso, double altura) {
        Paciente novoPaciente = new Paciente(numero, nome, peso, altura);
        pacientes.add(novoPaciente);
        System.out.println("Paciente adicionado com sucesso!");
    }

    // Método para alterar dados de um paciente
    public void alterarPaciente(int numero, String novoNome, double novoPeso, double novaAltura) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                paciente.setNome(novoNome);
                paciente.setPeso(novoPeso);
                paciente.setAltura(novaAltura);
                System.out.println("Dados do paciente atualizados com sucesso!");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    // Método para excluir um paciente
    public void excluirPaciente(int numero) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                pacientes.remove(paciente);
                System.out.println("Paciente excluído com sucesso!");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    // Método para listar todos os pacientes
    public void listarTodosPacientes() {
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
        for (Paciente paciente : pacientes) {
            if (paciente.getNumero() == numero) {
                System.out.println("Paciente encontrado:");
                paciente.listarPaciente();
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }
}

       
