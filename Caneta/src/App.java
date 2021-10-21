public class App {
    public static void main(String[] args) throws Exception {
        
        Caneta nova = new Caneta("Azul", "Esferográfica", 0.7f, "Plástico", 
        "Transparente", "Bic", 4.5f);
        Caneta usada = new Caneta("Preta", "Porosa", 0.9f, "Metal", 
        "Cinza", "Pentel", 15.5f);
        Caneta emprestada = new Caneta("Vermelha", "Seca", 0.3f, "Cerâmica", 
        "Branca", "Faber-Castell", 50.5f);

        nova.escrever();
        usada.escrever();
        emprestada.escrever();

        System.out.println();

        emprestada.testar(true);
        nova.testar(true);
        usada.testar(false);

        System.out.println();
                
        System.out.println(nova.trocar());
        System.out.println(usada.trocar());
        System.out.println(emprestada.trocar());

        System.out.println();
        
        System.out.format("A duração média das canetas é de %.1f dias\n", 
        Durabilidade.calculaMedia(15,36,12));
    }
}
