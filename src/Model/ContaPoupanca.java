package Model;

import util.Log;

public class ContaPoupanca extends Conta {
    private float taxaJuros;
    private float jurosDiarios;

    public ContaPoupanca(int numero, float taxaJuros, float jurosDiarios, double valor) {
        super(numero);
        this.taxaJuros = taxaJuros;
        this.jurosDiarios = jurosDiarios;
        super.valor = valor;
    }

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public float getJurosDiarios() {
        return jurosDiarios;
    }

    public void setJurosDiarios(float jurosDiarios) {
        this.jurosDiarios = jurosDiarios;
    }

    @Override
    public double consultaSaldo() throws Exception {
        return getValor();
    }

    @Override
    public void depositar(double valor) throws Exception {
        if (valor > 0) {
            super.valor += valor;
            Log.gravar("Deposito (CP) no valor de R$ " + valor + " conta " + numero);
        } else {
            throw new Exception("Valor inválido");
        }
    }

    @Override
    public void sacar(double valor) throws Exception {
        double juros = (valor * taxaJuros) / 100;
        if (valor <= (super.valor - juros)) {
            super.valor -= valor;
            Log.gravar("Saque (CP) no valor de R$ " + valor + " conta " + numero + " o seu saldo atual é de " + super.valor) ;
        } else {
            throw new Exception("Saldo insuficiente");
        }

    }

    @Override
    public void transeferir(Conta conta, double valor) throws Exception {
        double juros = (valor * taxaJuros) / 100;
        if (valor <= (super.valor - juros)) {
            sacar(valor);
            conta.depositar(valor);
            Log.gravar("Transferencia (CP) no valor de R$ " + valor + " da conta " + numero + "para a conta " + conta.numero);
        } else {
            throw new Exception("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "ContaPoupanca [taxaJuros=" + taxaJuros + ", jurosDiarios=" + jurosDiarios + super.toString() + "]";
    }

}
