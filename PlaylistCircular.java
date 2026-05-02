public class PlaylistCircular {

    private No primeiro;
    private No musicaAtual;

    public PlaylistCircular() {
        this.primeiro = null;
        this.musicaAtual = null;
    }

    public void adicionarMusica(Musica musica) {
        No novoNo = new No(musica);
        if (primeiro == null) {
            primeiro = novoNo;
            primeiro.setProximo(primeiro);
            musicaAtual = primeiro;
        } else {
            No ultimo = primeiro;
            while (ultimo.getProximo() != primeiro) {
                ultimo = ultimo.getProximo();
            }
            ultimo.setProximo(novoNo);
            novoNo.setProximo(primeiro);
        }
    }

    public void removerMusica(int id) {
        if (primeiro == null) {
            System.out.println("A playlist está vazia.");
            return;
        }
        No atual = primeiro;
        No anterior = null;
        do {
            if (atual.getMusica().getId() == id) {
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        } while (atual != primeiro);

        if (atual.getMusica().getId() != id) {
            System.out.println("Música com ID " + id + " não encontrada.");
            return;
        }

        if (musicaAtual == atual) {
            musicaAtual = atual.getProximo();
        }

        if (atual == primeiro) {
            if (primeiro.getProximo() == primeiro) {
                primeiro = null;
                musicaAtual = null;
            } else {
                No ultimo = primeiro;
                while (ultimo.getProximo() != primeiro) {
                    ultimo = ultimo.getProximo();
                }
                primeiro = primeiro.getProximo();
                ultimo.setProximo(primeiro);
            }
        } else {
            anterior.setProximo(atual.getProximo());
        }
        System.out.println("Música com ID " + id + " removida com sucesso.\n");
    }

    public Musica proximaMusica() {
        if (musicaAtual == null) {
            return null;
        }
        musicaAtual = musicaAtual.getProximo();
        return musicaAtual.getMusica();
    }

    public Musica musicaAtual() {
        if (this.musicaAtual == null) {
            return null;
        }
        return this.musicaAtual.getMusica();
    }

    public void exibirPlaylist() {
        if (primeiro == null) {
            System.out.println("A playlist está vazia!");
            return;
        }

        No temp = primeiro;
        do {
            System.out.println("----Música----"+
                    "\nID: " + temp.getMusica().getId() +
                    "\nTitulo: " + temp.getMusica().getTitulo() +
                    "\nArtista: " + temp.getMusica().getArtista() +
                    "\nDuracao: " + temp.getMusica().getDuracaoMinutos() + " min");
            System.out.println();
            temp = temp.getProximo();
        } while (temp != primeiro);
    }
}