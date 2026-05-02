//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArvoreBinaria ab = new ArvoreBinaria();

        ab.inserir(50);
        ab.inserir(30);
        ab.inserir(70);
        ab.inserir(20);
        ab.inserir(40);
        ab.inserir(60);
        ab.inserir(80);

        ab.imprimir_preOrder();

        System.out.println();

        ab.imprimir_inOrder();

        System.out.println();

        ab.imprimir_postOrder();

        ab.remover(70);

        System.out.println();

        ab.imprimir_inOrder();
    }
}