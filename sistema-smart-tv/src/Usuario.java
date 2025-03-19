public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("CanalAtual: " + smartTv.canal);
        smartTv.mudarCanal(12);
        System.out.println("CanalAtual: " + smartTv.canal);

        /*System.out.println("Volume Atual: " + smartTv.volume);  

       /*System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);*/


    }
}
