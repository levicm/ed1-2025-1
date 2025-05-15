package a01_lista_p03_tamanho;

public class Aluno {
	
	private String nome;
	private String email;

	public Aluno(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return nome + " (" + email + ")";
	}

}
