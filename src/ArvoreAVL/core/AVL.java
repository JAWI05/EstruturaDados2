public class AVL {
    private No raiz;

    public AVL() {
        this.raiz = null;
    }

    public int altura(No no){
        if(no == null){
            return -1;
        }
        return no.getAltura();
    }

    public int FatorBalanceamento(No no){
        if(no == null){
            return 0;
        }
        return altura(no.getEsq()) - altura(no.getDir());
    }

    public No rotacaoDir(No y){
        No x = y.getEsq();
        No T2 = x.getDir();

        x.setDir(y);
        y.setEsq(T2);

        y.setAltura(Math.max(altura(y.getEsq()), altura(y.getDir())) + 1);
        x.setAltura(Math.max(altura(x.getEsq()), altura(x.getDir())) + 1);

        return x;
    }

    public No rotacaoEsquerda(No x){
        No y = x.getDir();
        No T2 = y.getEsq();

        y.setEsq(x);
        x.setDir(T2);

        x.setAltura(Math.max(altura(x.getEsq()), altura(x.getDir())) + 1);
        y.setAltura(Math.max(altura(y.getEsq()), altura(y.getDir())) + 1);

        return y;
    }

    public void Inserir(int valor){
        raiz = inserir(raiz, valor);
    }

    private No inserir(No no, int valor){
        if(no == null){
            return new No(valor);
        }

        if (valor < no.getValor()){
            no.setEsq(inserir(no.getEsq(), valor));
        }
        else if (valor > no.getValor()){
            no.setDir(inserir(no.getDir(), valor));
        }
        else{
            return no; // valor repetido
        }

        no.setAltura(Math.max(altura(no.getEsq()), altura(no.getDir())) + 1);
        int fb = FatorBalanceamento(no);

        // LL
        if (fb > 1 && valor < no.getEsq().getValor())
            return rotacaoDir(no);

        // RR
        if (fb < -1 && valor > no.getDir().getValor())
            return rotacaoEsquerda(no);

        // LR
        if (fb > 1 && valor > no.getEsq().getValor()){
            no.setEsq(rotacaoEsquerda(no.getEsq()));
            return rotacaoDir(no);
        }

        // RL
        if (fb < -1 && valor < no.getDir().getValor()){
            no.setDir(rotacaoDir(no.getDir()));
            return rotacaoEsquerda(no);
        }

        return no;
    }

    public void remover(int valor){
        raiz = Remover(raiz, valor);
    }

    private No menorValorNo(No no) {
        No atual = no;
        while (atual.getEsq() != null) {
            atual = atual.getEsq();
        }
        return atual;
    }

    private No Remover(No no, int valor){
        if (no == null){
            return no;
        }

        if (valor < no.getValor()){
            no.setEsq(Remover(no.getEsq(), valor));
        }
        else if (valor > no.getValor()){
            no.setDir(Remover(no.getDir(), valor));
        }
        else {
            if (no.getEsq() == null || no.getDir() == null){
                No temp = (no.getEsq() != null) ? no.getEsq() : no.getDir();
                if (temp == null){
                    no = null;
                } else {
                    no = temp;
                }
            }
            else {
                No temp = menorValorNo(no.getDir());
                no.setValor(temp.getValor());
                no.setDir(Remover(no.getDir(), temp.getValor()));
            }
        }

        if(no == null)
            return no;

        no.setAltura(Math.max(altura(no.getEsq()), altura(no.getDir())) + 1);
        int balance = FatorBalanceamento(no);

        // LL
        if (balance > 1 && FatorBalanceamento(no.getEsq()) >= 0)
            return rotacaoDir(no);

        // LR
        if (balance > 1 && FatorBalanceamento(no.getEsq()) < 0){
            no.setEsq(rotacaoEsquerda(no.getEsq()));
            return rotacaoDir(no);
        }

        // RR
        if (balance < -1 && FatorBalanceamento(no.getDir()) <= 0)
            return rotacaoEsquerda(no);

        // RL
        if (balance < -1 && FatorBalanceamento(no.getDir()) > 0){
            no.setDir(rotacaoDir(no.getDir()));
            return rotacaoEsquerda(no);
        }

        return no;
    }


    public void imprimir() {
        imprimirArvore(raiz, 0);
    }

    private void imprimirArvore(No no, int nivel){
        if (no == null) return;

        imprimirArvore(no.getDir(), nivel + 1);

        for (int i = 0; i < nivel; i++)
            System.out.print("   ");

        System.out.println(no.getValor());

        imprimirArvore(no.getEsq(), nivel + 1);
    }
}
