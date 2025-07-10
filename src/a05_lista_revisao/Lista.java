package a05_lista_revisao;

public interface Lista<T> {
	
	public void adiciona(T elemento);
	public void adiciona(T elemento, int posicao);
	public int tamanho();
	public T pega(int posicao);
	public void remove(int posicao);
	public int busca(T elemento);
}
