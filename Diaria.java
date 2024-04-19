public class Diaria {
    private double valor;
    private Hospedagem hospedagem;

    public Diaria(double valor, Hospedagem hospedagem) {
        this.valor = valor;
        this.hospedagem = hospedagem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    @Override
    public String toString() {
        return "Diaria{" +
                "valor=" + valor +
                ", hospedagem=" + hospedagem +
                '}';
    }
}
