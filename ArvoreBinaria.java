public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor){
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private No inserirRecursivo(No noatual, int valor){

        if (noatual == null){
            return new No(valor);
        }

        if (valor < noatual.getValor()){
            noatual.setEsquerdo(inserirRecursivo(noatual.getEsquerdo(), valor));
        }

        if (valor > noatual.getValor()){
            noatual.setDireito(inserirRecursivo(noatual.getDireito(), valor));
        }

        return noatual;
    }

    public void remover(int valor){
        this.raiz = removerRecursivo(this.raiz, valor);
    }

    private int encontrarMenorValor(No noatual){
        while(noatual.getEsquerdo() != null){
            noatual = noatual.getEsquerdo();
        }
        return noatual.getValor();
    }

    private No removerRecursivo(No noatual, int valor){
        if (noatual == null){
            return null;
        }

        if(noatual.getValor() == valor){
            // sem filhos
            if (noatual.getEsquerdo() == null && noatual.getDireito() == null){
                return null;
            }

            // 1 filho
            if (noatual.getDireito() == null){
                return noatual.getEsquerdo();
            }

            if (noatual.getEsquerdo() == null){
                return noatual.getDireito();
            }

            int menorValor = encontrarMenorValor(noatual.getDireito());

            noatual.setValor(menorValor);

            noatual.setDireito(removerRecursivo(noatual.getDireito(), menorValor));

            return noatual;
        }
        else {
            // 2 filhos
            if (valor < noatual.getValor()){
                noatual.setEsquerdo(removerRecursivo(noatual.getEsquerdo(), valor));
            }

            else {
                noatual.setDireito(removerRecursivo(noatual.getDireito(),valor));
            }
        }
        return noatual;
    }

    private void preOrder(No no){
        if (no == null){
            return;
        }
        System.out.println(no.getValor());
        preOrder(no.getEsquerdo());
        preOrder(no.getDireito());
    }

    public void imprimir_preOrder(){
        preOrder(raiz);
    }

    private void inOrder(No no){
        if (no == null){
            return;
        }
        inOrder(no.getEsquerdo());
        System.out.println(no.getValor());
        inOrder(no.getDireito());
    }

    public void imprimir_inOrder(){
        inOrder(raiz);
    }

    private void postOrder(No no){
        if (no == null){
            return;
        }
        postOrder(no.getEsquerdo());
        postOrder(no.getDireito());
        System.out.println(no.getValor());
    }

    public void imprimir_postOrder(){
        postOrder(raiz);
    }
}
