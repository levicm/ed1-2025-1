package a09_lista_dupla_ligada_p01;

public class ListaDuplamenteLigada {
    private Celula inicio;
    private Celula fim;

    private int tamanho;

    public void adicionaNoComeco(Object elemento) {
        if (inicio == null) {
            Celula nova = new Celula(elemento, null, null);
            this.inicio = nova;
            this.fim = nova;
            tamanho++;
        } else {
            Celula nova = new Celula(elemento, inicio, null);
            this.inicio.setAnterior(nova);
            this.inicio = nova;
            tamanho++;
        }
    }

	public void adiciona(Object elemento) {
        if (inicio == null){
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento, null, fim);
            fim.setProxima(nova);
            fim = nova;
            tamanho++;
        }
    }

/*     private Celula pegaUltimo() {
        Celula celula = inicio;
        if (celula != null) {
            while (celula.getProxima() != null) {
                celula = celula.getProxima();
            }
        }
        return celula;
    }
 */
    public void adiciona(Object elemento, int posicao) {
        if (posicao == 0) {
            adicionaNoComeco(elemento);
        } else if (posicao == tamanho) {
            adiciona(elemento);
        } else {
            Celula celula = pegaCelula(posicao);
            Celula anterior = celula.getAnterior();

            Celula nova = new Celula(elemento, celula, anterior);

            celula.setAnterior(nova);
            anterior.setProxima(nova);
            tamanho++;
        }
    }

    private Celula pegaCelula(int posicao) {
        Celula celula = inicio;
        for (int i = 0; celula != null && i < posicao; ++i) {
            celula = celula.getProxima();
        }
        return celula;
    }

	public int tamanho() {
        return this.tamanho;
    }

    public Object pega(int posicao) {
        return null;
    }

    public void remove(int posicao) {
        if (posicao == 0) {
            if (tamanho == 1) {
                inicio = null;
                fim = null;
            } else {
                Celula proxima = inicio.getProxima();
                proxima.setAnterior(null);
                inicio = proxima;
            }
        } else if (posicao == tamanho - 1) {
            Celula anterior = fim.getAnterior();
            anterior.setProxima(null);
            fim = anterior;
        } else {
            Celula celula = pegaCelula(posicao);
            Celula anterior = celula.getAnterior();
            Celula proxima = celula.getProxima();

            anterior.setProxima(proxima);
            proxima.setAnterior(anterior);
        }

    }

    public int busca(Object elemento) {
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Celula celula = inicio;
        while (celula != null) {
            if (sb.length() > 1) {
                sb.append(", ");
            }
            sb.append(String.valueOf(celula.getElemento()));
            celula = celula.getProxima();
        }
        sb.append("]");
        return sb.toString();
    }
}
