public class App {
    public static void main(String[] args) throws Exception {
        
        Carro utilitario = new Carro("Ford", "Ranger", "Pickup cabine simples, câmbio manual"
        , "Prata", 'D', 2001, "9BD45826914581", 75, 160, 5, 2000);
        Carro passeio = new Carro("GM Motors", "Onix", "4 portas, câmbio manual", "Vermelho",
         'G', 2015, "9BDG251561215123", 55, 160, 50, 2500);
        Carro suv = new Carro("Toyota", "RAV-4", "4 portas, cambio automático", "Preto", 'F', 
        2018, "9BD8546875432", 65, 160, 0, 1000);

        System.out.format("\nDescrição do veículo %s %s para cadastro: \n%s, cor %s, ano %d, \nchassi %s, Motor %s\n",
        utilitario.fabricante, utilitario.modelo, utilitario.especificacao, utilitario.cor,
        utilitario.anoFabricacao, utilitario.chassi, utilitario.pegaCombustivel());

        System.out.format("\nDescrição do veículo %s %s para cadastro: \n%s, cor %s, ano %d, \nchassi %s, Motor %s\n",
        passeio.fabricante, passeio.modelo, passeio.especificacao, passeio.cor,
        passeio.anoFabricacao, passeio.chassi, passeio.pegaCombustivel());

        System.out.format("\nDescrição do veículo %s %s para cadastro: \n%s, cor %s, ano %d, \nchassi %s, Motor %s\n",
        suv.fabricante, suv.modelo, suv.especificacao, suv.cor,
        suv.anoFabricacao, suv.chassi, suv.pegaCombustivel());

        System.out.println();

        utilitario.trocarMarcha();
        passeio.trocarMarcha();
        suv.trocarMarcha();

        System.out.println();

        System.out.format("Velocidade Média = %.2f\n km/h", Media.veloMedia(utilitario.pegaVelocidade(), 
        passeio.pegaVelocidade(), suv.pegaVelocidade()));


    }
}
