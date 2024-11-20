package exercicioHeranca.projetoEmpresa.controle;
import exercicioHeranca.projetoEmpresa.dominio.Funcionario;
import exercicioHeranca.projetoEmpresa.dominio.Gerente;
import exercicioHeranca.projetoEmpresa.dominio.Vendas;
import java.util.ArrayList;
import java.util.List;


public class EmpresaController {
    private List<Funcionario> funcionarios;

    public EmpresaController() {
        this.funcionarios = new ArrayList<>();
    }

    // Adicionar um Funcionário
    public void adicionarFuncionario(String matricula, String cpf, String nome, float salario) {
        Funcionario funcionario = new Funcionario(matricula, cpf, nome, salario);
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    // Adicionar um Gerente
    public void adicionarGerente(String matricula, String cpf, String nome, float salario, float gratificacao) {
        Gerente gerente = new Gerente(matricula, cpf, nome, salario, gratificacao);
        funcionarios.add(gerente);
        System.out.println("Gerente adicionado com sucesso!");
    }

    // Adicionar um Funcionario de Vendas
    public void adicionarVendas(String matricula, String cpf, String nome, float salario, float gratificacao, float participacaoLucros) {
        Vendas vendas = new Vendas(matricula, cpf, nome, salario, gratificacao, participacaoLucros);
        funcionarios.add(vendas);
        System.out.println("Funcionário de Vendas adicionado com sucesso!");
    }

    // Listar todos os Funcionários
    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.println("Lista de Funcionários:");
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Vendas) {
                Vendas vendas = (Vendas) funcionario;
                System.out.println("Vendas: Nome: " + vendas.getNome() + ", CPF: " + vendas.getCpf() +
                                   ", Salário: " + vendas.getSalario() + ", Gratificação: " + vendas.getGratificacao() +
                                   ", Participação nos Lucros: " + vendas.getParticipacaoLucros());
            } else if (funcionario instanceof Gerente) {
                Gerente gerente = (Gerente) funcionario;
                System.out.println("Gerente: Nome: " + gerente.getNome() + ", CPF: " + gerente.getCpf() +
                                   ", Salário: " + gerente.getSalario() + ", Gratificação: " + gerente.getGratificacao());
            } else {
                System.out.println("Funcionário: Nome: " + funcionario.getNome() + ", CPF: " + funcionario.getCpf() +
                                   ", Salário: " + funcionario.getSalario());
            }
        }
    }
}
