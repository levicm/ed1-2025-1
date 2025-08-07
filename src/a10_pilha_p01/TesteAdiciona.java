package a10_pilha_p01;

public class TesteAdiciona {
    public static void main(String[] args) {
        Pilha pilha = new PilhaArranjo();
        System.out.println(pilha);
    
        // Adicionando elementos à pilha
        pilha.adiciona(new Aluno("João"));
        System.out.println(pilha);

        pilha.adiciona(new Aluno("Maria"));
        System.out.println(pilha);

        pilha.adiciona(new Aluno("Pedro"));
        System.out.println(pilha);

        for (int i = 0; i < 52; i++) {
            pilha.adiciona(new Aluno("Aluno" + i));
        }
    }
}
