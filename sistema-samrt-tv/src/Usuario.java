public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual ? : " + smartTv.canal);
        System.out.println("Volume atual ? : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV desliga? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.baixarVolume();
        System.out.println("Volume atual ? : " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.print("Novo Canal : " + smartTv.canal + " ");

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual ? : " + smartTv.canal );

            

    }
}
