public class Serie {

    private String titulo;
    private int numTemporadas;

    public Serie(String titulo, int numTemporadas) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
    }

    public String toString(){
        return "------Série------\n"+
                "Título: "+this.titulo+"\n"+
                "Número de temporadas: "+this.numTemporadas+"\n";
    }
}
