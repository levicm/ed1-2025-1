package a04_lista_p11_busca;

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
	public boolean equals(Object obj) {
		if (obj instanceof Aluno) {
			Aluno outro = (Aluno) obj;
			return this.nome.equals(outro.nome) && this.email.equals(outro.email);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return nome + " (" + email + ")";
	}

}









