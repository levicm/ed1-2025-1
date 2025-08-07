package a10_pilha_p01;

public class TesteRemove {
    public static void main(String[] args) {
        Pilha pilha = new PilhaArranjo();
        System.out.println(pilha);
        System.out.println(pilha.consulta());
    
        // Adicionando elementos à pilha
        pilha.adiciona(new Aluno("João", "joao@gmail.com"));
        System.out.println(pilha);
        System.out.println(pilha.remove());

        pilha.adiciona(new Aluno("Maria", "maria@gmail.com"));
        pilha.adiciona(new Aluno("Pedro", "pedro@gmail.com"));
        System.out.println(pilha);
        System.out.println(pilha.remove());
        System.out.println(pilha.remove());
        System.out.println(pilha);
        System.out.println(pilha.remove());
    }
}
