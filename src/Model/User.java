package Model;

public class User {
    private String nome;
    private Conta conta;
    public User(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    @Override
    public String toString() {
        return "\nUser [nome=" + nome + ", conta=" + conta + "]";
    } 

    
}
