package a03_lista_p09_interface;

public class Programa {

	public static void main(String[] args) {
		// TAD - Tipo Abstrato de Dados - Lista
		Lista lista = new ListaArranjo();

		lista.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
		lista.adiciona(new Aluno("Maria", "maria@gmail.com"));
		lista.adiciona(new Aluno("Joana", "joana@gmail.com"));
		lista.adiciona(new Aluno("Cacilda", "cacilda@gmail.com"));
		
		System.out.println(lista);
	}

}
