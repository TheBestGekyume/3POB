package AV2.projeto;

import AV2.projeto.view.FuncionarioView;


public class Main {
    public static void main(String[] args) {
        System.out.println("\nIniciando o sistema...");
        FuncionarioView view = new FuncionarioView();
        view.menu();
        System.out.println("\nSistema encerrado.");
    }
}
