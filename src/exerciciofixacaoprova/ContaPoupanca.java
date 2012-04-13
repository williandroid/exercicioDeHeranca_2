
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
        Teclado ler = new Teclado();
        cliente = ler.lerStrings("Digite o Cliente: ");
        numConta = ler.lerStrings("Digite o numero da Conta: ");
        numAgencia = ler.lerStrings("Digite o numero da Agencia: ");
        saldo = ler.lerReal("Digite o saldo: ");
    }
    
    public float calcularNovoSalario(float taxa)
    {         
         taxa = getSaldo() * (taxa / 100);
         saldo = getSaldo() + taxa;
         return taxa;
        
    }
}
