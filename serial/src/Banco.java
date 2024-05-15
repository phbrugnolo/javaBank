import java.util.List;

public class Banco {
    private List<Usuario> usuarios;
    private String corrente = "corrente", poupanca = "poupanca", tipo;

    public Banco(List<Usuario> usuarios, String tipo) {
        this.usuarios = usuarios;
        this.tipo = tipo;
    }

    public void addUser(Usuario user) {
        if (buscarUsuario(user.getNome()) == null)
            usuarios.add(user);
    }

    public Usuario buscarUsuario(String cpf) {
        return usuarios.stream().filter(c -> c.getCpf().equals(cpf)).findFirst().orElse(null);
    }

    public void addSaldo(float dinheiro, String cpf) {
        Usuario user = buscarUsuario(cpf);
        user.setSaldo(user.getSaldo() + dinheiro);
    }

    public void removeSaldo(float dinheiro, String cpf) {
        Usuario user = buscarUsuario(cpf);
        user.setSaldo(user.getSaldo() - dinheiro);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getCorrente() {
        return corrente;
    }

    public void setCorrente(String corrente) {
        this.corrente = corrente;
    }

    public String getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(String poupanca) {
        this.poupanca = poupanca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Banco [usuarios=" + usuarios + ", corrente=" + corrente + ", poupanca=" + poupanca + ", tipo=" + tipo
                + "]";
    }

}
