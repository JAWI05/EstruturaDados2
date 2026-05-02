import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private No inserirRecursivo(No noAtual, int valor) {
        if (noAtual == null) {
            return new No(valor);
        }
        if (valor < noAtual.getValor()) {
            noAtual.setEsquerdo(inserirRecursivo(noAtual.getEsquerdo(), valor));
        }
        if (valor > noAtual.getValor()) {
            noAtual.setDireito(inserirRecursivo(noAtual.getDireito(), valor));
        }
        return noAtual;
    }

    public void remover(int valor) {
        this.raiz = removerRecursivo(this.raiz, valor);
    }

    public No removerRecursivo(No noatual, int valor) {
        if (noatual == null) {
            return null;
        }
        if (noatual.getValor() == valor) {
            // sem filhos
            if (noatual.getEsquerdo() == null && noatual.getDireito() == null) {
                return null;
            }
            // 1 filho
            if (noatual.getDireito() == null) {
                return noatual.getEsquerdo();
            }
            if (noatual.getEsquerdo() == null) {
                return noatual.getDireito();
            }
            int menorValor = encontrarMenorValor(noatual.getDireito());
            noatual.setValor(menorValor);
            noatual.setDireito(removerRecursivo(noatual.getDireito(), menorValor));
            return noatual;
        } else {
            // 2 filhos
            if (valor < noatual.getValor()) {
                noatual.setEsquerdo(removerRecursivo(noatual.getEsquerdo(), valor));
            } else {
                noatual.setDireito(removerRecursivo(noatual.getDireito(), valor));
            }
        }
        return noatual;
    }

    public int encontrarMenorValor(No noatual) {
        while (noatual.getEsquerdo() != null) {
            noatual = noatual.getEsquerdo();
        }
        return noatual.getValor();
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(this.raiz, valor);
    }

    public boolean buscarRecursivo(No noAtual, int valor) {
        if (noAtual == null) {
            return false;
        }
        if (noAtual.getValor() == valor) {
            return true;
        }
        if (valor < noAtual.getValor()) {
            return buscarRecursivo(noAtual.getEsquerdo(), valor);
        } else {
            return buscarRecursivo(noAtual.getDireito(), valor);
        }
    }

    public void imprimirEmOrdem() {
        imprimirEmOrdemRecursivo(raiz);
    }

    public void imprimirEmOrdemRecursivo(No no) {
        if (no == null) {
            return;
        }
        imprimirEmOrdemRecursivo(no.getEsquerdo());
        System.out.println(no.getValor() + " ");
        imprimirEmOrdemRecursivo(no.getDireito());
    }

    public void preorder(No no) {
        if (no == null) {
            return;
        }
        System.out.println(no.getValor());
        preorder(no.getEsquerdo());
        preorder(no.getDireito());
    }

    public void ImprimirPreorder() {
        preorder(raiz);
    }

    public void inorder(No no) {
        if (no == null) {
            return;
        }
        inorder(no.getEsquerdo());
        System.out.println(no.getValor());
        inorder(no.getDireito());
    }

    public void ImprimirInOrder() {
        inorder(raiz);
    }

    public void postorder(No no) {
        if (no == null) {
            return;
        }
        postorder(no.getEsquerdo());
        postorder(no.getDireito());
        System.out.println(no.getValor());
    }

    public void ImprimirPostOrder() {
        postorder(raiz);
    }

    public void ImprimirBFS() {
        imprimirBFSInterno(this.raiz);
    }

    private void imprimirBFSInterno(No no) {
        if (no == null) {
            return;
        }
        LinkedList<No> fila = new LinkedList<>();
        fila.add(no);

        System.out.println("Travessia BFS (Em Nível):");

        while (!fila.isEmpty()) {
            No noAtual = fila.removeFirst();
            System.out.print(noAtual.getValor() + " ");

            if (noAtual.getEsquerdo() != null) {
                fila.add(noAtual.getEsquerdo());
            }

            if (noAtual.getDireito() != null) {
                fila.add(noAtual.getDireito());
            }
        }
        System.out.println();
    }
}
