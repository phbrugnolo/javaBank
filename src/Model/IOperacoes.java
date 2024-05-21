package Model;

public interface IOperacoes {

    public void sacar(double valor) throws Exception;
    public void depositar(double valor) throws Exception;
    public void transeferir(Conta conta,double valor) throws Exception;
    public double consultaSaldo() throws Exception;
}
