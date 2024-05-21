package Model;

public class ContaPoupanca extends Conta {
    private float taxaJuros;
    private float jurosDiarios;
    public ContaPoupanca(int numero, float taxaJuros, float jurosDiarios) {
        super(numero);
        this.taxaJuros = taxaJuros;
        this.jurosDiarios = jurosDiarios;
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
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public void depositar(double valor) throws Exception {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void sacar(double valor) throws Exception {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void transeferir(Conta conta, double valor) throws Exception {
        // TODO Auto-generated method stub
        
    }
    @Override
    public String toString() {
        return "ContaPoupanca [taxaJuros=" + taxaJuros + ", jurosDiarios=" + jurosDiarios + super.toString() + "]";
    }

    
}
