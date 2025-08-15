package a11_fila_p02_composicao;

import a04_lista_p11_busca.ListaArranjo;

public class FilaLista implements Fila {

    private ListaArranjo lista =  new ListaArranjo();

    @Override
    public void adiciona(Object elemento) {
        lista.adiciona(elemento);
    }

    @Override
    public Object consulta() {
        return lista.pega(0);
    }

    @Override
    public Object remove() {
        Object resultado = lista.pega(0);
        lista.remove(0);
        return resultado;
    }

    @Override
    public int tamanho() {
        return lista.tamanho();
    }
    
    @Override
    public String toString() {
        return lista.toString();
    }
}
