import Calculos.CalculadoraDeTempo;
import Calculos.FiltroRecomendacao;
import modelo.Episodio;
import modelo.Filme;
import modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Breaking Bad");
        minhaSerie.setAnoDeLancamento(2008);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpisodiosPorTemporada(13);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println("Duração em minutos para maratonar a serie: " + minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Clube da luta");
        outroFilme.setAnoDeLancamento(1999);
        outroFilme.setDuracaoEmMinutos(166);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println("Total de minutos para assistir o filme: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtro(episodio);

        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da linta: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
    }
}