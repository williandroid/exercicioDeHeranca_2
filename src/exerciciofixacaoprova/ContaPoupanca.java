
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
    


    
    public void calcularNovoSalario()
    {         
         Teclado ler = new Teclado();
         float taxa = 0;
         
         taxa = ler.lerReal("Valor: ");
         taxa = getSaldo() * (taxa / 100);
         saldo = getSaldo() + taxa;
        
    }
}
