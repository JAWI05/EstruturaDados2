//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lista_Circular lista = new Lista_Circular();
        lista.adicionar(12);
        lista.adicionar(88);
        lista.adicionar(87);
        lista.adicionar(56);
        lista.adicionar(7);

        lista.exibir();

        lista.remover(87);

        lista.exibir();
    }
}
