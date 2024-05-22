package Controller;

import java.util.List;
import Model.ContaCorrente;
import Model.ContaPoupanca;
import Model.User;

public class CaixaController {
    private List<User> usuers;

    public CaixaController(List<User> usuers) {
        this.usuers = usuers;
    }


    private int criarNumeroConta(){
        return usuers.stream().filter(u -> u.getConta() != null).mapToInt(u -> u.getConta().getNumero()).max().orElse(0) + 1;
    }

    public void abrirConta(User user){
        user.setConta(
            new ContaCorrente(criarNumeroConta(), 10000, 7)
        );
    }

    public void abrirConta(User user, double valor){
        user.setConta(
            new ContaPoupanca(criarNumeroConta(), 5, 0.5f, valor)
        );
    }

    public void criarUsuario(String nome){
        try {
            User user = buscaUser(nome);
        } catch (Exception e) {
            usuers.add(new User(nome));
        }
    }

    public void cancelarConta(String nome) throws Exception{
        try {
            User user = buscaUser(nome);
            user.getConta().setAitvo(false);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public User buscaUser(String nome) throws Exception{
        return usuers.stream().filter(u -> u.getNome().equalsIgnoreCase(nome)).findFirst().orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    @Override
    public String toString() {
        return "CaixaController [usuers=" + usuers + "]";
    } 

    
}
