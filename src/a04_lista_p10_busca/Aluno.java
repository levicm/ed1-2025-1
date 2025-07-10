package a04_lista_p10_busca;

public class Aluno {
	
	private String nome;
	private String email;

	public Aluno(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return nome + " (" + email + ")";
	}

}
