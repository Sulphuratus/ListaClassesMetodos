public class Caneta {

    String corTinta;
    String tipoPOnta;
    float larguraPonta;
    String materialCorpo;
    String corCaneta;
    String fabricante;
    double preco;

    public Caneta(String corTinta, String tipoPonta, float larguraPonta, 
    String materialCorpo, String corCaneta, String fabricante, 
    double preco){
        this.corTinta = corTinta;
        this.tipoPOnta = tipoPonta;
        this.larguraPonta = larguraPonta;
        this.materialCorpo = materialCorpo;
        this.corCaneta = corCaneta;
        this.fabricante = fabricante;
        this.preco = preco;
    }
    
    public void escrever (){
        if(larguraPonta > 0.7){
            System.out.format("A escrita da caneta %s é muito grossa e pesada!\n", fabricante);
        }else if(larguraPonta <= 0.7 && larguraPonta >= 0.5 ){
            System.out.format("A escrita da caneta %s é perfeita!\n", fabricante);
        }else if(larguraPonta <0.5){
            System.out.format("A escrita da caneta %s é difícil de enxergar!\n", fabricante);
        }
    }

    public void testar (Boolean falhando){
        if ( falhando == true){
            System.out.format("A caneta %s não funciona, reprovada!\n", fabricante);
        }else{
            System.out.format("A caneta %s está aprovada!\n", fabricante);
        }
    }


    
    public String trocar (){
        String acao = " ";
        if ( preco < 5 ){
            acao = String.format("A caneta %s deve ser trocada!", fabricante);
        }else if( preco >= 5 && preco <= 20){
            acao = String.format("A carga da caneta %s deve ser trocada!", fabricante);
        }else if( preco > 10){
            acao = String.format("A caneta %s deve ser devolvida!", fabricante);
        }
        return acao;
    }
    
}
