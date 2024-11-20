package AV2.projeto.model.classes;
import AV2.projeto.model.Funcionario;
import AV2.projeto.model.interfaces.Treina;

public class Treinador extends Funcionario implements Treina {
    public Treinador(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Treinador [ID=" + getId() + ", Nome=" + getNome() + ", Salário=" + getSalario() + "]");
    }

    @Override
    public void ensinarTecnologia() {
        System.out.println(getNome() + " está ensinando novas tecnologias.");
    }

    @Override
    public void motivarEquipe() {
        System.out.println(getNome() + " está motivando a equipe.");
    }
}