package exercicioHeranca.projetoEmpresa.dominio;

public class Vendas extends Gerente {
    private float participacaoLucros;

    // Construtor
    public Vendas(String matricula, String cpf, String nome, float salario, float gratificacao, float participacaoLucros) {
        super(matricula, cpf, nome, salario, gratificacao);
        this.participacaoLucros = participacaoLucros;
    }

    // Getter e Setter
    public float getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(float participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }
}
