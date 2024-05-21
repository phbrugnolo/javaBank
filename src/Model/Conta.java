package Model;

public abstract class Conta implements IOperacoes {
    protected int numero;
    protected double valor;
    protected boolean aitvo;

    public Conta(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isAitvo() {
        return aitvo;
    }

    public void setAitvo(boolean aitvo) {
        this.aitvo = aitvo;
    }

    @Override
    public String toString() {
        return "Conta [numero=" + numero + ", valor=" + valor + "Conta " + (aitvo? "Ativa" : "Inativa");
    }

    
}
