package AV2.exercicioArrayList;

public class Paciente {
    private int numero;
    private String nome;
    private double peso;
    private double altura;

    // Construtor
    public Paciente(int numero, String nome, double peso, double altura) {
        this.numero = numero;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para listar as informações do paciente
    public void listarPaciente() {
        System.out.println("Paciente Nº: " + numero + ", Nome: " + nome + ", Peso: " + peso + ", Altura: " + altura);
    }
}


