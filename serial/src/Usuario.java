public class Usuario extends Pessoa {
    private String email;
    private int numConta;
    private float saldo;

    public Usuario(String nome, String cpf, String telefone, String email, int numConta) {
        super(nome, cpf, telefone);
        this.email = email;
        this.numConta = numConta;
        this.saldo = 0.00f;
    }



    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }


    public float getSaldo() {
        return saldo;
    }


    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }



}
