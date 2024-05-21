package Model;

public class ContaCorrente extends Conta {
    private double limite;
    private float taxa;

    public ContaCorrente(int numero, double limite, float taxa) {
        super(numero);
        this.limite = limite;
        this.taxa = taxa;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    @Override
    public double consultaSaldo() throws Exception {
        return getValor();
    }

    @Override
    public void depositar(double valor) throws Exception {
        if (valor > 0) {
            super.valor += valor;
        } else {
            throw new Exception("Valor inválido");
        }
    }

    @Override
    public void sacar(double valor) throws Exception {
        if (valor >= (super.valor + limite)) {
            super.valor -= valor;
        } else {
            throw new Exception("Saldo insuficiente");
        }

    }

    @Override
    public void transeferir(Conta conta, double valor) throws Exception {
        if(valor >= (super.valor + limite)){
            sacar(valor);
            conta.depositar(valor);
        }else {
            throw new Exception("Saldo insuficente");
        }

    }

    @Override
    public String toString() {
        return "ContaCorrente [limite=" + limite + ", taxa=" + taxa + super.toString() + " ]";
    }

}
