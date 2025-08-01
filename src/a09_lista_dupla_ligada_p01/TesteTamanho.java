package a09_lista_dupla_ligada_p01;

public class TesteTamanho {

	public static void main(String[] args) {
		ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
		System.out.println(lista.tamanho() == 0);

		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		System.out.println(lista.tamanho() == 1);
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		System.out.println(lista.tamanho() == 2);
		lista.adiciona(new Aluno("Joana", "joana@gmail.com"));
		System.out.println(lista.tamanho() == 3);
		lista.adiciona(new Aluno("Cacilda", "cacilda@gmail.com"));
		System.out.println(lista.tamanho() == 4);
		
		for (int i = 0; i < 96; ++i) {
			lista.adiciona(new Aluno("Aluno" + i, "aluno" + i + "@gmail.com"));
		}
		
		System.out.println(lista.tamanho() == 100);
	}

}
