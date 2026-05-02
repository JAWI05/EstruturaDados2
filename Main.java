public class Main {
    public static void main(String[] args) {
        ArvoreBinaria ab = new ArvoreBinaria();
        ab.inserir(8);
        ab.inserir(4);
        ab.inserir(12);
        ab.inserir(2);
        ab.inserir(6);
        ab.inserir(10);
        ab.inserir(14);
        ab.inserir(1);
        ab.inserir(3);
        ab.inserir(5);
        ab.inserir(7);
        ab.inserir(9);
        ab.inserir(11);
        ab.inserir(13);

        ab.ImprimirPreorder();
        System.out.println();
        ab.ImprimirInOrder();
        System.out.println();
        ab.ImprimirPostOrder();
        System.out.println();
        ab.ImprimirBFS();
        System.out.println();

        System.out.println("Ex 2");
        System.out.println();

        ArvoreBinaria ab1 = new ArvoreBinaria();
        ab1.inserir(50);
        ab1.inserir(55);
        ab1.inserir(45);
        ab1.inserir(30);
        ab1.inserir(80);
        ab1.inserir(13);
        ab1.inserir(56);
        ab1.inserir(99);
        ab1.inserir(43);
        ab1.inserir(75);
        ab1.inserir(61);
        ab1.inserir(28);
        ab1.inserir(78);
        ab1.inserir(110);
        ab1.inserir(84);
        ab1.inserir(48);

        ab1.ImprimirPreorder();

        System.out.println();

        ab1.remover(110);
        ab1.remover(84);
        ab1.remover(55);
        ab1.remover(30);
        ab1.remover(78);
        ab1.remover(45);

        ab1.ImprimirPreorder();
    }
}