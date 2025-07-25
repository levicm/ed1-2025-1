package a08_lista_ligada_p01;

public class ListaLigada {
    private Celula inicio;
    private int tamanho;

    public void adicionaNoComeco(Object elemento) {
        if (inicio == null) {
            Celula nova = new Celula(elemento, null);
            this.inicio = nova;
            tamanho++;
        } else {
            Celula nova = new Celula(elemento, inicio);
            this.inicio = nova;
            tamanho++;
        }
    }

	public void adiciona(Object elemento) {
        if (inicio == null){
            adicionaNoComeco(elemento);
        } else {
            Celula ultimo = pegaUltimo();
            Celula nova = new Celula(elemento, null);
            ultimo.setProxima(nova);
            tamanho++;
        }
    }

    private Celula pegaUltimo() {
        Celula celula = inicio;
        if (celula != null) {
            while (celula.getProxima() != null) {
                celula = celula.getProxima();
            }
        }
        return celula;
    }

    public void adiciona(Object elemento, int posicao) {
    }

	public int tamanho() {
        return this.tamanho;
    }

    public Object pega(int posicao) {
        return null;
    }

    public void remove(int posicao) {
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
