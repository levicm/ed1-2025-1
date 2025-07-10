package a06_comparable_p01;

public class Programa {

    public static void main(String[] args) {
        Lista<Candidato> lista = new ListaArranjo<Candidato>();
        lista.adiciona(new Candidato("João", 20, 8.5));
        lista.adiciona(new Candidato("Maria", 22, 9.0)); 
        lista.adiciona(new Candidato("Pedro", 19, 9.5));
        lista.adiciona(new Candidato("Ana", 21, 8.0));
        lista.adiciona(new Candidato("Lucas", 23, 9.5));

        Candidato maior = null;
        for (int i = 0; i < lista.tamanho(); i++) {
            Candidato candidato = lista.pega(i);
            if (maior == null || candidato.compareTo(maior) > 0) {
                maior = candidato;
            }
        }

        System.out.println("Candidato com a maior nota: " + maior);
    }
}
