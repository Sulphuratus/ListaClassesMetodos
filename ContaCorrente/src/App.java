import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {
        
        ContaCorrente pfSimples = new ContaCorrente ("José Aparecido Souza", "223366-6", 
        "Econômica", "854-P", "Banco Cooperativa Rural", 983.55f, 2000.0f, 1372.44f, 2015);
        ContaCorrente pfConjunta = new ContaCorrente ("Maria Antônia da Costa", "333888-1", 
        "Básica", "335-0", "Banco das Maldivas", 1824.95f, 5000.0f, 2350.22f, 2017);
        ContaCorrente pjSimples = new ContaCorrente ("Astrogildo Pereira dos Santos", "884479-9",
        "Premium", "951-R", "Banco Interafricano", 2381.22f, 3000.0f, 3871.20f, 2020);
       
        pfSimples.mostrar();
        pfConjunta.mostrar();
        pjSimples.mostrar();

        System.out.println();

        pfSimples.aumentar();
        pfConjunta.aumentar();
        pjSimples.aumentar();

        System.out.println();

        System.out.println(Premio.selecionar("", 
        pfSimples.contar(Calendar.getInstance().get(Calendar.YEAR),0), pfSimples.titular));

        System.out.println(Premio.selecionar("", 
        pfConjunta.contar(Calendar.getInstance().get(Calendar.YEAR),0), pfConjunta.titular));

        System.out.println(Premio.selecionar("", 
        pjSimples.contar(Calendar.getInstance().get(Calendar.YEAR),0), pjSimples.titular)); 
    }
}
