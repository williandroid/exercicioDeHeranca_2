
package exerciciofixacaoprova;

public class ContaPoupanca extends ContaBancaria
{
    private int diaDeRendimento;

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public ContaPoupanca(String cliente, String numConta, String numAgencia, float saldo) {
        super(cliente, numConta, numAgencia, saldo);
    }
    

    public ContaPoupanca() 
    {
        
    }

    
    public float calcularNovoSalario(float taxa)
    {         
         taxa = getSaldo() * (taxa / 100);
         saldo = getSaldo() + taxa;
         return taxa;
        
    }
}
