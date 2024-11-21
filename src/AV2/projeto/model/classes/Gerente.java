package AV2.projeto.model.classes;
import AV2.projeto.model.Funcionario;
import AV2.projeto.model.interfaces.Gerencia;

public class Gerente extends Funcionario implements Gerencia {
    public Gerente(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Gerente [ ID = " + getId() + ", Nome = " + getNome() + ", Salário = " + getSalario() + " ]");
    }

    @Override
    public void organizarEquipe() {
        System.out.println(getNome() + " está organizando a equipe.");
    }

    @Override
    public void conduzirReunioes() {
        System.out.println(getNome() + " está conduzindo reuniões.");
    }
}