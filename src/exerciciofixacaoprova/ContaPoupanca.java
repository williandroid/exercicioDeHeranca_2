
package exerciciofixacaoprova;

public class ContaPoupanca extends ContaBancaria
{
    private int diaDeRendimento;

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public ContaPoupanca(String cliente, int numConta, int numAgencia, float saldo) {
        super(cliente, numConta, numAgencia, saldo);
    }


    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }
    
    public float calcularNovoSalario(float taxa)
    {         
         saldo = (taxa/100) * getSaldo();
         return saldo;
        
    }
}
