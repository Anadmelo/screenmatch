package Calculos;

public class FiltroRecomendacao {
    private String recomendacao;


    public void filtro(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Está entre os mais assistidos");
        } else {
            System.out.println("Está entre os menos assistidos");

        }

    }

}
