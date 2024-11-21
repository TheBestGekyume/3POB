package AV2.projeto.model.classes;

import AV2.projeto.model.Funcionario;
import AV2.projeto.model.interfaces.Desenvolve;
import AV2.projeto.model.interfaces.Gerencia;

public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve {
    public GerenteDesenvolvedor(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Gerente Desenvolvedor [ ID = " + getId() + ", Nome = " + getNome() + ", Salário = " + getSalario() + " ]");
    }

    @Override
    public void organizarEquipe() {
        System.out.println(getNome() + " está organizando a equipe.");
    }

    @Override
    public void conduzirReunioes() {
        System.out.println(getNome() + " está conduzindo reuniões.");
    }

    @Override
    public void codar() {
        System.out.println(getNome() + " está codando.");
    }

    @Override
    public void resolverProblemas() {
        System.out.println(getNome() + " está resolvendo problemas.");
    }
}