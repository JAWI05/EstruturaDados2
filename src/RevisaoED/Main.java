//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Filme f1 = new Filme("Como treinar seu dragão", 120);
        Filme f2 = new Filme("Cidade de Deus", 130);

        Serie s1 = new Serie("Stranger Things", 4);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(s1.toString());
        System.out.println();

        App app = new App("Strong", "Paulo", 45);
        System.out.println(app.toString());
        System.out.println();

        Musica musica1 = new Musica("Wake me up", "Avicil", "4:50");
        Musica musica2 = new Musica("Vermelho", "Gloria", "3:00");
        Musica musica3 = new Musica("123", "Claudio", "5:10");

        Playlist playlist = new Playlist("My Favorite");

        playlist.AdicionarMusica(musica1);
        playlist.AdicionarMusica(musica2);
        playlist.AdicionarMusica(musica3);

        playlist.ExibirPlaylist();
        System.out.println();

        Usuario usuario1 = new UsuarioComum("Livia");
        Usuario usuario2 = new UsuarioVerificado("Felipe");

        usuario1.postarMensagem();
        usuario2.postarMensagem();
        System.out.println();
    }
}
