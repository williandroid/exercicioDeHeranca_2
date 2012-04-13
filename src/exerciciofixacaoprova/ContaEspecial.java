
package exerciciofixacaoprova;

public class ContaEspecial extends ContaBancaria
{
    private float limiteDeCheque;

    public ContaEspecial(String cliente, String numConta, String numAgencia, float saldo) {
        super(cliente, numConta, numAgencia, saldo);
    }
    
    public ContaEspecial() 
    {        

    }
      

    @Override
    public void sacar(float valor) 
    {
        super.sacar(valor);
        
        if (valor < saldo)
        {
            saldo -= valor; 
            System.out.println("Realizado o saque de: " + valor);
        }

        
    }
 }
    
