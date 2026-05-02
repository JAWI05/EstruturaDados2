public class Main {
    public static void main(String[] args) {

        PlaylistCircular playlistCircular = new PlaylistCircular();
        Musica musica1 = new Musica(1, "Macapa", "jj", 12);
        Musica musica2 = new Musica(2, "Carneirinho", "JP", 3);
        Musica musics3 = new Musica(3, "Caldo", "Bruno", 2);

        playlistCircular.adicionarMusica(musica1);
        playlistCircular.adicionarMusica(musica2);
        playlistCircular.adicionarMusica(musics3);

        playlistCircular.exibirPlaylist();

        playlistCircular.removerMusica(3);

        playlistCircular.exibirPlaylist();
    }
}