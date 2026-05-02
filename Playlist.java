import java.util.ArrayList;

public class Playlist {

    private String nome;
    private ArrayList<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void AdicionarMusica(Musica musica){
        musicas.add(musica);
    }

    public void ExibirPlaylist(){
        System.out.println("----Palylist----");
        for (Musica m : this.musicas){
            System.out.println(m.toString());
        }
    }
}
