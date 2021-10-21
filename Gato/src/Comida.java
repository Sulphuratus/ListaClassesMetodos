

public class Comida {

    public static String porcaoDiaria (String humor, Boolean peixe, boolean carne, 
    boolean racao){
        if (peixe == true && carne == true){
            humor = "O gato está muito feliz.";
        }else if(peixe == true || carne == true && racao == true){
            humor = "O gato está satisfeito.";
        }else if(peixe == false && carne == false && racao == true){
            humor  = "O gato está mal humorado!!";
        }else if(peixe == false && carne == false && racao == false){
            humor = "O gato está faminto!!";
        }
        return humor ;
        
    }
    
}
