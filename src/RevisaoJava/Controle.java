import java.util.Scanner;
import java.util.ArrayList;

class Controle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar quantidade");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            opcao = in.nextInt();
            in.nextLine(); // limpar buffer

            if (opcao == 1) {
                System.out.print("Nome do produto: ");
                String nome = in.nextLine();
                System.out.print("Quantidade: ");
                int quantidade = in.nextInt();
                in.nextLine(); // limpar buffer

                estoque.add(new Produto(nome, quantidade));
                System.out.println("Produto adicionado!");

            } else if (opcao == 2) {
                if (estoque.isEmpty()) {
                    System.out.println("Nenhum produto no estoque.");
                } else {
                    System.out.println("\n--- Lista de Produtos ---");
                    for (Produto p : estoque) {
                        System.out.println(p);
                    }
                }

            } else if (opcao == 3) {
                System.out.print("Digite o nome do produto para atualizar: ");
                String nomeBusca = in.nextLine();
                boolean encontrado = false;

                for (Produto p : estoque) {
                    if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                        System.out.print("Nova quantidade: ");
                        int novaQtd = in.nextInt();
                        in.nextLine(); // limpar buffer
                        p.setQuantidade(novaQtd);
                        System.out.println("Quantidade atualizada!");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Produto não encontrado.");
                }
            } else if (opcao == 4) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        in.close();
    }
}
