package projetosDeAprendizado.aprendendoSintaxe;

public class smartTv_Metodo3 {

    /* Aprendendo sobre escopo.
     * As variáveis ligada, canal e volume são de escopo class, ou seja, está disponível
     * em todo nosso código da smartTv_Metodo3.
     * Já a variável novoCanal é variável de escopo local, ou seja, está disponível 
     * somente em mudarCanal.
     */

    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal (){
        canal--;
    }
}
