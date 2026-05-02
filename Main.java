//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lista_Duplamente_Encadeada list = new Lista_Duplamente_Encadeada();
        list.adicionar(45);
        list.adicionar(7);
        list.adicionar(69);
        list.adicionar(78);
        list.adicionar(19);
        list.adicionar(851);

        list.exibir();

        list.remover(7);
        list.remover(89);

        list.exibir();
    }
}