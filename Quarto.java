public class Quarto {
    private int numero;
    private String nome;
    private double valorDiaria;
    private String categoria;
    private int andar;

    public Quarto(int numero, String nome, double valorDiaria, String categoria, int andar) {
        this.numero = numero;
        this.nome = nome;
        this.valorDiaria = valorDiaria;
        this.categoria = categoria;
        this.andar = andar;
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

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }
}
