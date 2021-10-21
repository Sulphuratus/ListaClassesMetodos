public class Carro {
    
    String fabricante;
    String modelo;
    String especificacao;
    String cor;
    char motor;
    int anoFabricacao;
    String chassi;
    int autonomia;
    int veloMax;
    double veloAtual;
    int rotacao;
    

    public Carro(String fabricante, String modelo, String especificacao, String cor,
    char motor, int anoFabricacao, String chassi, int autonomia, int veloMax, 
    double veloAtual, int rotacao){
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.especificacao = especificacao;
    this.cor = cor;
    this.motor = motor;
    this.anoFabricacao = anoFabricacao;
    this.chassi = chassi;
    this.autonomia = autonomia;
    this.veloMax = veloMax;
    this.veloAtual = veloAtual;
    this.rotacao = rotacao;
    }

    public String pegaCombustivel(){
        String combustivel;
        switch (motor){
            case 'F':
            combustivel = "Flex (Etanol e Gasolina)";
            break;

            case 'D':
            combustivel = "Diesel";
            break;

            case 'G':
            combustivel = "Gasolina";
            break;

            default:
            combustivel = "Não especificado";
            }
        return combustivel;
        }

        public double pegaVelocidade(){
            return veloAtual;

        }
        public void trocarMarcha(){
            if(rotacao == 0){
                if (veloAtual == 0){
                    System.out.println("Carro está parado e o motor desligado!");
                }else if(veloAtual > 0){
                    System.out.println("\nAtenção, O carro está em movimento e com motor desligado!");
                }
            }else if(rotacao > 0 && rotacao <= 1000){
                if (veloAtual == 0){
                    System.out.println("Carro está parado com motor ligado, não pressione o acelerador");
                }else if(veloAtual > 0){
                    System.out.println("Atenção, O carro está em movimento e com motor ligado!");
                }
            }else if (rotacao > 1000){ 
                if (veloAtual == 0){
                    System.out.println("O carro está parado com motor ligado, não pressione o acelerador!");
                }else if(veloAtual > 0 && veloAtual < 10){
                    System.out.println("Atenção, O carro está em movimento e com motor ligado!");
                }else if(veloAtual >= 10){
                    System.out.println("Atenção, Hora de trocar de marcha!");
                }
                
            }

        }
        
    }

    

