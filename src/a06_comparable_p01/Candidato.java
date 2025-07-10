package a06_comparable_p01;

public class Candidato implements Comparable<Candidato> {
    String nome;
    int idade;
    double nota;

    public Candidato(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public int compareTo(Candidato outro) {
        if (this.nota > outro.nota) {
            return 1;
        } else if (this.nota < outro.nota) {
            return -1;
        } else {
            // Nota igual, comparar pela idade
            if (this.idade > outro.idade) {
                return 1;
            } else if (this.idade < outro.idade) {
                return -1;
            } else {
                return 0;
            }
        }
    }
    @Override
    public String toString() {
        return nome + " - Idade: " + idade + ", Nota: " + nota;
    }
}
