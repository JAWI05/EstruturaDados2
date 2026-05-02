public class UsuarioComum extends Usuario{

    public UsuarioComum(String nome) {
        super(nome);
    }

    @Override
    public void postarMensagem(){
        System.out.println("Usuário comum postou uma mensagem.");
    }
}
