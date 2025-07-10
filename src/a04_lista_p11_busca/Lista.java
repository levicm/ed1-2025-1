package a04_lista_p11_busca;

public interface Lista {
	
	public void adiciona(Object elemento);
	public void adiciona(Object elemento, int posicao);
	public int tamanho();
	public Object pega(int posicao);
	public void remove(int posicao);
	public int busca(Object elemento);
}
