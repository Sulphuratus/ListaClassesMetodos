public class App {
    public static void main(String[] args) throws Exception {
       
        Gato domestico = new Gato("Jorge", "Siames", "Caramelo", "Azuis", 
        'M', 2f, 2.5f);
        Gato selvagem = new Gato("Mel", "SRD", "Cinza Claro", "Castanhos", 
        'F', 3f, 3.5f);

        /*domestico.nome = "Jorge";
        domestico.raca = "Siames";
        domestico.sexo = 'M';
        domestico.idade = 2f;
        domestico.peso = 2.5f;
        domestico.corPelo = "Caramelo";
        domestico.corOlhos = "Azuis";
        domestico.cacaRato = 1;

        selvagem.nome = "Mel";
        selvagem.raca = "SRD";
        selvagem.sexo = 'F';
        selvagem.idade = 3f;
        selvagem.peso = 3.5f;
        selvagem.corPelo = "Cinza Claro";
        selvagem.corOlhos = "Castanho";
        selvagem.cacaRato = 4;*/

        System.out.println(domestico.nome);
        System.out.println(selvagem.nome);

        System.out.println();
        selvagem.ronronar();
        domestico.miar("Miau, Miau, Miaaaauuuuuuu");

        System.out.println("\n");
        System.out.println(selvagem.subirTelhado(true, true));
        System.out.println(domestico.subirTelhado(false, true));
        System.out.println(domestico.subirTelhado(false, false));

        System.out.println();
        domestico.cacar();
        selvagem.cacar();
        System.out.println();

        System.out.println(Comida.porcaoDiaria("",false, false, true));


    }
}
