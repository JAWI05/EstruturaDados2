public class Main {
    public static void main(String[] args) {

        Lista_DuplamenteEncadeada lista = new Lista_DuplamenteEncadeada();
        lista.inserirDado_Inicio(15);
        lista.inserirDado_Inicio(45);
        lista.inserirDado_Final(55);
        lista.inserirDado_Inicio(41);
        lista.inserirDado_Final(88);

        lista.mostrarLista();

        lista.quantidadeLista();

        System.out.println();

        lista.removerValor(15);

        lista.mostrarLista();

        lista.quantidadeLista();

        System.out.println();

        lista.inverterLista();

        lista.valorMaior();

        lista.valorMenor();
    }
}