public class Lista_DuplamenteEncadeada {
    private No inicio;
    private int contador = 0;
    int valorMaximo = 0;
    int valorMinimo = 99999999;

    public Lista_DuplamenteEncadeada() {
        this.inicio = null;
    }

    public void inserirDado_Inicio(int dado){
        No novoNo = new No(dado);
        if(inicio == null){
            inicio = novoNo;
        }
        else {
            novoNo.setProximo(inicio);
            inicio.setAnterior(novoNo);
            inicio = novoNo;
        }
        contador++;
    }

    public void inserirDado_Final(int dado){
        No novoNo = new No(dado);
        if (inicio == null){
            inicio = novoNo;
        }
        else {
            No temp = inicio;
            while (temp.getProximo() != null){
                temp = temp.getProximo();
            }
            temp.setProximo(novoNo);
            novoNo.setAnterior(temp);
        }
        contador++;
    }

    public void removerValor(int dado){
        if (inicio == null){
            System.out.println("Lista vazia!");
        }
        else {
            No temp = inicio;
            if (temp.getDado() == dado){
                inicio = temp.getProximo();
                if (inicio != null){
                    inicio.setAnterior(null);
                }
                contador--;
            }

            while (temp != null && temp.getDado() != dado){
                temp = temp.getProximo();
            }

            if (temp != null){
                if (temp.getProximo() != null){
                    temp.getProximo().setAnterior(temp.getAnterior());
                }
                if (temp.getAnterior() != null){
                    temp.getAnterior().setProximo(temp.getProximo());
                }
                contador--;
            }
        }
    }

    public void mostrarLista(){
        if (inicio == null){
            System.out.println("A lista está vazia!");
            return;
        }
        No temp = inicio;
        while (temp != null){
            System.out.println(temp.getDado());
            temp = temp.getProximo();
        }
    }

    public void quantidadeLista() {
        System.out.println("A lista possui "+contador+" elementos.");
    }

    public void valorMaior(){
        if (inicio == null){
            System.out.println("A lista está vazia!");
            return;
        }
        No temp = inicio;
        while(temp != null){
            if (temp.getDado() > valorMaximo){
                valorMaximo = temp.getDado();
            }
            temp = temp.getProximo();
        }
        System.out.println("O valor maior da lista é "+ valorMaximo);
    }

    public void valorMenor(){
        if (inicio == null){
            System.out.println("A lista está vazia!");
            return;
        }
        No temp = inicio;
        while (temp != null){
            if (temp.getDado() < valorMinimo){
                valorMinimo = temp.getDado();
            }
            temp = temp.getProximo();
        }
        System.out.println("O valor menor da lista é "+ valorMinimo);
    }

    public void inverterLista(){
        if(inicio == null){
            System.out.println("A lista está vazia!");
        }

        No temp = inicio;
        while (temp.getProximo() != null){
            temp = temp.getProximo();
        }

        while (temp != null){
            System.out.println(temp.getDado());
            temp = temp.getAnterior();
        }
    }
}
