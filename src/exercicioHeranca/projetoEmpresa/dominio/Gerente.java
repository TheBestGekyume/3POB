package exercicioHeranca.projetoEmpresa.dominio;

public class Gerente extends Funcionario {
    private float gratificacao;

    // Construtor
    public Gerente(String matricula, String cpf, String nome, float salario, float gratificacao) {
        super(matricula, cpf, nome, salario);
        this.gratificacao = gratificacao;
    }

    // Getter e Setter
    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }
}
