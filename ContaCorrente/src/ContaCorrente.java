import java.util.Calendar;

public class ContaCorrente {
    
    String titular;
    String numeroConta;
    String cestaServicos;
    String agencia;
    String banco;
    double saldoMedio;
    double limiteCredito;
    double saldo;
    int anoAbertura;


    public ContaCorrente (String titular, String numeroConta, String cestaServicos, 
    String agencia, String banco, double saldoMedio, double limiteCredito, 
    double saldo, int anoAbertura){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.cestaServicos = cestaServicos;
        this.agencia = agencia;
        this.banco = banco;
        this.saldoMedio = saldoMedio;
        this.limiteCredito = limiteCredito;
        this.saldo = saldo;
        this.anoAbertura = anoAbertura; 
    
    }

    public void mostrar(){
        System.out.format("O saldo do titular %s , conta nº %s, agência %s, \n %s, é: R$ %.2f\n",
        titular, numeroConta, agencia, banco, saldo);
    }

    public void aumentar(){
        if (saldoMedio <= 1000){
            System.out.format("O limite de cŕedito do cliente %s não pode aumentar!\n", titular);
        }else if (saldoMedio > 1000 && saldoMedio < 2000){
            System.out.format("O limite de crédito do cliente %s deve aumentar para R$ %.2f\n", 
            titular, limiteCredito*1,3);
        }else if( saldoMedio >= 2000){
            System.out.format("O limite de crédito do cliente %s deve aumentar para R$ %.2f\n", 
            titular, limiteCredito);
        }
    }

    public int contar(int anoAtual, int idadeConta){
        anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return idadeConta =  anoAtual - anoAbertura;
    }
    
}
