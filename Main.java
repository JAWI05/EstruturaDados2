//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArvoreBinaria ab = new ArvoreBinaria();

        ab.inserir(36);
        ab.inserir(12);
        ab.inserir(77);
        ab.inserir(91);
        ab.inserir(53);
        ab.inserir(49);
        ab.inserir(27);
        ab.inserir(6);
        ab.inserir(62);

        ab.imprimir_emOrdem();
    }
}