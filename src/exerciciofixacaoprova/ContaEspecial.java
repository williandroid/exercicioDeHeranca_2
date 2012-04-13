
package exerciciofixacaoprova;

public class ContaEspecial extends ContaBancaria
{
    private float limiteDeCheque;

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
    
