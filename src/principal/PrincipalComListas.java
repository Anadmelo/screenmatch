package principal;

import modelo.Filme;
import modelo.Serie;
import modelo.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1972);
        meuFilme.avalia(6);
        Filme outroFilme = new Filme("Clube da luta", 1999);
        outroFilme.avalia(10);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(7);
        Serie minhaSerie = new Serie("Breaking Bad", 2008);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(minhaSerie);

        for (Titulo item: listaDeAssistidos){
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
            System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        System.out.println();
        System.out.println("Lista de artistas: ");
        // Exemplo de uso de ArrayList para armazenar artistas

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Ryan Gosling");
        buscaPorArtista.add("Brad Pitt");
        buscaPorArtista.add("Robert Pattison");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Em artistas em ordem alfabetica: "+ buscaPorArtista);


        Collections.sort(listaDeAssistidos);
        System.out.println("Lista de filmes e series em ordem alfabetica: " + listaDeAssistidos);
    }
}
