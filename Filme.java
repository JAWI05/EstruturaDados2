public class Filme {

    private String titulo;
    private int duracaoMinutos;

    public Filme(String titulo, int duracaoMinutos) {
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String toString(){
        return "------Filme------\n"+
                "Título: "+this.titulo+"\n"+
                "Duração: "+this.duracaoMinutos+"min \n";
    }
}
