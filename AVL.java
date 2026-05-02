public class AVL {
    private No raiz;

    public AVL() {
        this.raiz = null;
    }

    public int Altura(No no){
        if (no == null){
            return -1;
        }
        return no.getAltura();
    }

    public int Fator_Balanceamento(No no){
        if (no == null){
            return 0;
        }
        return Altura(no.getEsquerdo()) - Altura(no.getDireito());
    }

    private No rotacaoDir(No y){
        No x = y.getEsquerdo();
        No T2 = x.getDireito();

        x.setDireito(y);
        y.setEsquerdo(T2);

        y.setAltura( Math.max( Altura(y.getEsquerdo()), Altura(y.getDireito() )) + 1 );
        x.setAltura( Math.max( Altura(x.getEsquerdo()), Altura(x.getDireito() )) + 1 );

        return x;
    }

    private No rotacaoEsq(No x){
        No y = x.getDireito();
        No T2 = y.getEsquerdo();

        y.setEsquerdo(x);
        x.setDireito(T2);

        x.setAltura( Math.max( Altura(x.getEsquerdo()), Altura(x.getDireito())) + 1 );
        y.setAltura( Math.max( Altura(y.getEsquerdo()), Altura(y.getDireito())) + 1 );

        return y;
    }

    public void inserir(int valor){
        raiz = inserirRecursivo(raiz, valor);
    }

    private No inserirRecursivo(No no, int valor){
        if (no == null){
            return new No(valor);
        }

        if (valor < no.getValor()){
            no.setEsquerdo(inserirRecursivo(no.getEsquerdo(), valor));
        }
        else {
            if (valor > no.getValor()){
                no.setDireito(inserirRecursivo(no.getDireito(), valor));
            }
            else {
                return no;
            }
        }

        no.setAltura( Math.max( Altura(no.getEsquerdo()), Altura(no.getDireito())) + 1 );

        int Fator_Balanceamento = Fator_Balanceamento(no);

        if( Fator_Balanceamento > 1 && valor < no.getEsquerdo().getValor()){
            return rotacaoDir(no);
        }

        if (Fator_Balanceamento < -1 && valor > no.getDireito().getValor()){
            return rotacaoEsq(no);
        }

        if (Fator_Balanceamento > 1 && valor > no.getEsquerdo().getValor()){
            no.setEsquerdo(rotacaoEsq(no.getEsquerdo()));
            return rotacaoDir(no);
        }

        if (Fator_Balanceamento < -1 && valor < no.getDireito().getValor()){
            no.setDireito(rotacaoDir(no.getDireito()));
            return rotacaoEsq(no);
        }

        return no;
    }
}
