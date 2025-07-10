package a03_lista_p07_aloc_din;

public class TesteAlocacaoDinamica {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println(lista.tamanho() == 0);

		for (int i = 0; i < 10000; ++i) {
			lista.adiciona(new Aluno("Aluno" + i, "aluno" + i + "@gmail.com"));
		}
		System.out.println(lista.tamanho() == 120);
		System.out.println(lista.tamanho());
	}

}
