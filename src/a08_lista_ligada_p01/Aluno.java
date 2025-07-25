package a08_lista_ligada_p01;

public class Aluno implements Comparable<Aluno> {
	
	private String nome;
	private String email;
	private Double nota;

	public Aluno(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	public Aluno(String nome, String email, Double nota) {
		super();
		this.nome = nome;
		this.email = email;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

	public Double getNota() {
		return nota;
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
		return nome + " [" + nota + "]";
	}

	@Override
	public int compareTo(Aluno o) {
		return Double.compare(this.nota, o.nota);
	}

}









