public class Lista_Circular {
    private No primeiro;
    private No atual;

    public Lista_Circular() {
        this.primeiro = null;
        this.atual = null;
    }

    public void adicionar(int dado){
        No novoNo = new No(dado);
        if(primeiro == null){
            primeiro = novoNo;
            primeiro.setProximo(primeiro);
            atual = primeiro;
        } else{
            No ultimo = primeiro;
            while (ultimo.getProximo() != primeiro){
                ultimo = ultimo.getProximo();
            }
            ultimo.setProximo(novoNo);
            novoNo.setProximo(primeiro);
        }
    }

    public void remover(int dado){
        if(primeiro == null){
            System.out.println("Lista vazia!");
        }
        No atual = primeiro;
        No anterior = null;
        do {
            if(atual.getDado() == dado){
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        } while(atual != primeiro);

        if (atual.getDado() != dado){
            System.out.println("O nó "+ dado + " não foi encontrado!");
            return;
        }

        if (atual == primeiro && atual.getProximo() == primeiro) {
            primeiro = null;
            return;
        }

        if (atual == primeiro) {
            No ultimo = primeiro;
            while (ultimo.getProximo() != primeiro) {
                ultimo = ultimo.getProximo();
            }
            primeiro = primeiro.getProximo();
            ultimo.setProximo(primeiro);
        }

        else {
            anterior.setProximo(atual.getProximo());
        }
    }

    public void exibir() {
        if (primeiro == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        No temp = primeiro;
        do {
            System.out.print(temp.getDado()+" -> ");
            temp = temp.getProximo();
        } while (temp != primeiro);
        System.out.println();
    }
}
