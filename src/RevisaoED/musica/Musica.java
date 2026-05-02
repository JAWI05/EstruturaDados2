public class Musica {

    private String titulo;
    private String artista;
    private String duracao;

    public Musica(String titulo, String artista, String duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String toString(){
        return "====Música=====\n"+
                "Título: "+ titulo +"\n"+
                "Artista: "+ artista +"\n"+
                "Duração: "+ duracao + "\n";
    }
}
