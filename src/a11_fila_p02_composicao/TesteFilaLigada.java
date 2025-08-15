package a11_fila_p02_composicao;

public class TesteFilaLigada {

    public static void main(String[] args) {
        Fila fila = new FilaLigada();
        System.out.println(fila);
        System.out.println(fila.tamanho() == 0);

        fila.adiciona(new Aluno("Maria"));
        System.out.println(fila.tamanho() == 1);
        System.out.println(String.valueOf(fila.consulta()).equals("Maria"));

        fila.adiciona(new Aluno("Joao"));
        fila.adiciona(new Aluno("Pedro"));
        System.out.println(fila.tamanho() == 3);
        System.out.println(fila);

        Aluno aluno = (Aluno) fila.remove();
        System.out.println(aluno.getNome().equals("Maria"));
        System.out.println(aluno);
    }
    
}
