public class Main {
    public static void main(String[] args) {
        AVL avl1 = new AVL();
        avl1.Inserir(50);
        avl1.Inserir(30);
        avl1.Inserir(70);
        avl1.Inserir(20);
        avl1.Inserir(40);
        avl1.Inserir(10);

        System.out.println("AVL 1:");
        avl1.imprimir();

        AVL avl2 = new AVL();
        avl2.Inserir(10);
        avl2.Inserir(20);
        avl2.Inserir(5);
        avl2.Inserir(25);
        avl2.Inserir(30);
        avl2.Inserir(40);

        System.out.println("\nAVL 2:");
        avl2.imprimir();
    }
}
