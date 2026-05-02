public class Lista_Duplamente_Encadeada {
    private No primeiro;
    private No ultimo;

    public Lista_Duplamente_Encadeada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    // Adicionar no final
    public void adicionar(int dado) {
        No novoNo = new No(dado);
        if (primeiro == null) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.setProximo(novoNo);
            novoNo.setAnterior(ultimo);
            ultimo = novoNo;
        }
    }

    // Remover por valor
    public void remover(int dado) {
        if (primeiro == null) {
            System.out.println("Lista vazia!");
            return;
        }

        No atual = primeiro;

        while (atual != null && atual.getDado() != dado) {
            atual = atual.getProximo();
        }

        if (atual == null) {
            System.out.println("O nó " + dado + " não foi encontrado!");
            return;
        }

        if (atual == primeiro) {
            primeiro = atual.getProximo();
            if (primeiro != null) {
                primeiro.setAnterior(null);
            } else {
                ultimo = null;
            }
        }

        else if (atual == ultimo) {
            ultimo = atual.getAnterior();
            ultimo.setProximo(null);
        }

        else {
            atual.getAnterior().setProximo(atual.getProximo());
            atual.getProximo().setAnterior(atual.getAnterior());
        }
    }

    public void exibir() {
        if (primeiro == null) {
            System.out.println("Lista vazia!");
            return;
        }
        No aux = primeiro;
        while (aux != null) {
            System.out.print(aux.getDado() + " -> ");
            aux = aux.getProximo();
        }
        System.out.println("null");
    }
}
