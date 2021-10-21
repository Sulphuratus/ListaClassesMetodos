public class Gato {
    String nome;
    String raca;
    String corPelo;
    String corOlhos;
    int cacaRato;
    char sexo;
    float idade;
    float peso;

    public Gato(String nome, String raca, String corPelo, String corOlhos,
    char sexo, float idade, float peso){
        this.nome = nome;
        this.raca = raca;
        this.corPelo = corPelo;
        this.corOlhos = corOlhos;
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
        this.cacaRato = 0;

    }

    public void ronronar(){
        if (sexo == 'M'){
            System.out.format("O gato %s está Ronronando!!\n", nome);
        }else if (sexo == 'F'){
            System.out.format("A Gata %s está Ronronando!!\n", nome);
        }
    }

    public void cacar(){

        if ( cacaRato == 0){
            if (sexo == 'M'){
                System.out.format("O gato %s está morrendo de fome!!\n", nome);
            }else if (sexo == 'F'){
                System.out.format("A Gata %s está morrendo de fome!!\n", nome);
            }
        }else if( cacaRato > 0 && cacaRato <= 3){
            if (sexo == 'M'){
                System.out.format("O gato %s não está com fome!!\n", nome);
            }else if (sexo == 'F'){
                System.out.format("A Gata %s não está com fome!!\n", nome);
            }
        }else{
            if (sexo == 'M'){
                System.out.format("O gato %s vai passar mal!!\n", nome);
            }else if (sexo == 'F'){
                System.out.format("A Gata %s vai passar mal!!\n", nome);
            }
        }
    }

    public void miar(String miado){
        if (sexo == 'M'){
            System.out.format("O gato %s está miando: %s", nome, miado);
        }else if (sexo == 'F'){
            System.out.format("A Gata %s está miando: %s", nome, miado);
        }
    }

    public String subirTelhado(Boolean miadoForte, Boolean peloArrepiado){
        String reacao = " ";
        if( miadoForte == true && peloArrepiado == true){
            if (sexo == 'M'){
                reacao = String.format("O gato %s está no cio!", nome);
            }else if (sexo == 'F'){
                reacao = String.format("A gata %s está no cio!", nome);
            }
        }else if( miadoForte == false && peloArrepiado == true){
            if (sexo == 'M'){
                reacao = String.format("O gato %s está brigando!", nome);
            }else if (sexo == 'F'){
                reacao = String.format("A gata %s está brigando!", nome);
            }
        }else if( miadoForte == false && peloArrepiado == false){
            if (sexo == 'M'){
                reacao = String.format("O gato %s está tranquilo!", nome);
            }else if (sexo == 'F'){
                reacao = String.format("A gata %s está tranquila", nome);
            }
        }
        return reacao;
    }
    
}
