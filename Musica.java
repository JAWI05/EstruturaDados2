public class Musica {

    int id;
    String titulo;
    String artista;
    int duracaoMinutos;

    public Musica(int id, String titulo, String artista, int duracaoMinutos) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public String toString(){
        return "---Musica---\n"+
                "Id: "+id+ "\n"+
                "Título: "+titulo+" \n"+
                "Artista: "+artista+" \n"+
                "Duração em minutos: "+duracaoMinutos+ "\n";
    }
}
