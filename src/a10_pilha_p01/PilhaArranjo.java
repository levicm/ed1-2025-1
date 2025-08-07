package a10_pilha_p01;

public class PilhaArranjo implements Pilha {

    private Object[] elementos = new Object[50];
    private int topo = -1;

    @Override
    public void adiciona(Object elemento) {
        if (topo == elementos.length - 1) {
            throw new RuntimeException("Pilha cheia");
        }
        topo++;
        elementos[topo] = elemento;
    }

    @Override
    public Object remove() {
        if (topo == -1) {
            return null;
        }
        Object resultado = elementos[topo];
        elementos[topo] = null;
        topo--;
        return resultado;
    }

    @Override
    public Object consulta() {
        if (topo == -1) {
            return null;
        }
        return elementos[topo];
    }

    @Override
    public int tamanho() {
        return topo + 1;
    }

    @Override
    public boolean vazia() {
        return topo == -1;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= topo; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(elementos[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
