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

    public void imprimir_emOrdem() {
        imprimir_emOrdemRecursivo(raiz);
    }

    private void imprimir_emOrdemRecursivo(No no){
        if(no == null){
            return;
        }
        imprimir_emOrdemRecursivo(no.getEsquerdo());
        System.out.println(no.getValor() + " ");
        imprimir_emOrdemRecursivo(no.getDireito());
    }
}
