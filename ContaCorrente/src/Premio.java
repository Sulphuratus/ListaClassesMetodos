
public class Premio {
    
    public static String selecionar (String premio, int idadeConta, String titular){
        if (idadeConta >= 1 && idadeConta < 2 ){
            premio = String.format(
            "O Cliente %s receberá um cartâo de crédito com anuidade grátis se gastar R$ 500,00 por mês.", titular);    
        }else if (idadeConta >=2 && idadeConta <= 4){
           premio = String.format(
            "O Cliente %s receberá um cartâo de crédito com anuidade grátis no 1º ano de uso.", titular);
        }else if(idadeConta > 4 ){
            premio = String.format(
            "O Cliente %s receberá um cartâo de crédito com anuidade grátis enquanto estiver usando.", titular);
        }return premio;
    }
}
