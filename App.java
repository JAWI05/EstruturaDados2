public class App {

    private String nome;
    private String desenvolvedor;
    private double preco;

    public App(String nome, String desenvolvedor, double preco) {
        this.nome = nome;
        this.desenvolvedor = desenvolvedor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
        }
        else {
            System.out.println("Preço menor que 0!");
        }
    }

    public String toString(){
        return "====App====\n"+
                "Nome: "+ nome + "\n"+
                "Desenvolvedor: "+ desenvolvedor + "\n"+
                "Preço: "+ preco + "\n";
    }
}
