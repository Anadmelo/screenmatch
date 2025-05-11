package Calculos;

import modelo.Filme;
import modelo.Serie;
import modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;


    public int getTempoTotal() {
        return tempoTotal;
    }


    public void inclui (Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

}
