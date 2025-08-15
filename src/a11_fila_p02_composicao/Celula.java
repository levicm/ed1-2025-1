package a11_fila_p02_composicao;

public class Celula {
    private Object elemento;
    private Celula anterior;
    private Celula proxima;

    public Celula(Object elemento, Celula anterior, Celula proxima) {
        this.elemento = elemento;
        this.anterior = anterior;
        this.proxima = proxima;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }

    @Override
    public String toString() {
        return String.valueOf(elemento);
    }
}