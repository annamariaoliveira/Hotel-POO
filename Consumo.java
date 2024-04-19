public class Consumo {
    private String item;
    private double valor;
    private int quantidade;

    public Consumo(String item, double valor, int quantidade) {
        this.item = item;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Consumo{" +
                "item='" + item + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
