package AV2.exercicioArquivo;

public class Paciente {
    private int numero;
    private String nome;
    private double peso;
    private double altura;

    public Paciente(int numero, String nome, double peso, double altura) {
        this.numero = numero;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

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

    public void listarPaciente() {
        System.out.println("Paciente Nº: " + numero + ", Nome: " + nome + ", Peso: " + peso + ", Altura: " + altura);
    }

    @Override
    public String toString() {
        return numero + ";" + nome + ";" + peso + ";" + altura;
    }

    public static Paciente fromString(String linha) {
        String[] partes = linha.split(";");
        int numero = Integer.parseInt(partes[0]);
        String nome = partes[1];
        double peso = Double.parseDouble(partes[2]);
        double altura = Double.parseDouble(partes[3]);
        return new Paciente(numero, nome, peso, altura);
    }
}

