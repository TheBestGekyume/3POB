package exercicioHeranca.projetoFabrica.controle;
import exercicioHeranca.projetoFabrica.dominio.Cliente;
import exercicioHeranca.projetoFabrica.dominio.PessoaFisica;
import exercicioHeranca.projetoFabrica.dominio.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private List<Cliente> clientes;

    public ClienteController() {
        this.clientes = new ArrayList<>();
    }

    // Adicionar um cliente do tipo Pessoa Física
    public void adicionarPessoaFisica(String endereco, String telefone, String cpf, String nome) {
        PessoaFisica pessoaFisica = new PessoaFisica(endereco, telefone, cpf, nome);
        clientes.add(pessoaFisica);
        System.out.println("Pessoa Física adicionada com sucesso!");
    }

    // Adicionar um cliente do tipo Pessoa Jurídica
    public void adicionarPessoaJuridica(String endereco, String telefone, String cnpj, String razaoSocial) {
        PessoaJuridica pessoaJuridica = new PessoaJuridica(endereco, telefone, cnpj, razaoSocial);
        clientes.add(pessoaJuridica);
        System.out.println("Pessoa Jurídica adicionada com sucesso!");
    }

    // Listar todos os clientes
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }
    
        System.out.println("Lista de clientes:");
        for (Cliente cliente : clientes) {
            if (cliente instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) cliente;
                System.out.println("Pessoa Física: Nome: " + pf.getNome() + ", CPF: " + pf.getCpf() +
                                   ", Endereço: " + pf.getEndereco() + ", Telefone: " + pf.getTelefone());
            } else if (cliente instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) cliente;
                System.out.println("Pessoa Jurídica: Razão Social: " + pj.getRazaoSocial() + ", CNPJ: " + pj.getCnpj() +
                                   ", Endereço: " + pj.getEndereco() + ", Telefone: " + pj.getTelefone());
            }
        }
    }
    

    // Buscar um cliente pelo CPF
    public PessoaFisica buscarPessoaFisicaPorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) cliente;
                if (pf.getCpf().equals(cpf)) {
                    return pf;
                }
            }
        }
        return null;
    }

    // Buscar um cliente pelo CNPJ
    public PessoaJuridica buscarPessoaJuridicaPorCnpj(String cnpj) {
        for (Cliente cliente : clientes) {
            if (cliente instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) cliente;
                if (pj.getCnpj().equals(cnpj)) {
                    return pj;
                }
            }
        }
        return null;
    }

    // Remover cliente pelo CPF
    public boolean removerPessoaFisicaPorCpf(String cpf) {
        PessoaFisica pf = buscarPessoaFisicaPorCpf(cpf);
        if (pf != null) {
            clientes.remove(pf);
            System.out.println("Pessoa Física removida com sucesso.");
            return true;
        }
        System.out.println("Pessoa Física não encontrada.");
        return false;
    }

    // Remover cliente pelo CNPJ
    public boolean removerPessoaJuridicaPorCnpj(String cnpj) {
        PessoaJuridica pj = buscarPessoaJuridicaPorCnpj(cnpj);
        if (pj != null) {
            clientes.remove(pj);
            System.out.println("Pessoa Jurídica removida com sucesso.");
            return true;
        }
        System.out.println("Pessoa Jurídica não encontrada.");
        return false;
    }
}
