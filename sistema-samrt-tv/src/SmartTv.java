public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //Criando método mudar canal
    public void mudarCanal (int novoCanal){
        canal = novoCanal;

    }

    public void aumentarCanal(){
        //canal = canal + 1; ou
            canal++;
            System.out.println("Aumentando o canal para: " + canal);
    }

    public void diminuirCanal(){
        //canal = canal - 1; ou
            canal--;
            System.out.println("Diminuindo o canal para: " + canal);
    }

    //Criando método aumentar volume
    public void aumentarVolume() {
        //volume = volume + 1; ou
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    //Criando metodo baixar volume
    public void baixarVolume() {
        //volume = volume -1; ou
        volume--;
        System.out.println("Baixando o volume para: " + volume);
    }


    //Criando método Ligar TV - Void Porque não teremos retorno
    public void ligar() {
        ligada = true;
        
    }

    //Criando método Desligar TV - Void Porque não teremos retorno
    public void desligar() {
        ligada = false;
    }


}
