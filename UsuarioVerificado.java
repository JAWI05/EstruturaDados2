public class UsuarioVerificado extends Usuario {

    public UsuarioVerificado(String nome) {
        super(nome);
    }

    @Override
    public void postarMensagem() {
        System.out.println(nome + " (Usuário verificado) postou uma mensagem e pode fazer lives.");
    }
}
