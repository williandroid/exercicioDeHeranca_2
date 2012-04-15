
package exerciciofixacaoprova;

public class ContaEspecial extends ContaBancaria
{
    private float limiteDeCheque;

    public float getLimiteDeCheque() {
        return limiteDeCheque;
    }

    public void setLimiteDeCheque(float limiteDeCheque) {
        this.limiteDeCheque = limiteDeCheque;
    }

    public ContaEspecial(String cliente, String numConta, String numAgencia, float saldo) {
        super(cliente, numConta, numAgencia, saldo);
    }

      

    @Override
    public void sacar(float valor) 
    {
        if(super.getSaldo()-valor >= -limiteDeCheque)
        {
            super.setSaldo(super.getSaldo() - valor);
            System.out.println("Valor sacado com sucess: " + valor);
        }            
        else
        {
            System.out.println("Erro");
        }    
    }
}