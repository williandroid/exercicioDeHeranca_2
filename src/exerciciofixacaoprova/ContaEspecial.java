
package exerciciofixacaoprova;

public class ContaEspecial extends ContaBancaria
{
    private float limiteDeCheque;

    public ContaEspecial(String cliente, String numConta, String numAgencia, float saldo) {
        super(cliente, numConta, numAgencia, saldo);
    }
    

    public ContaEspecial() 
    {        
        Teclado ler = new Teclado();
        cliente = ler.lerStrings("Digite o Cliente: ");
        numConta = ler.lerStrings("Digite o numero da Conta: ");
        numAgencia = ler.lerStrings("Digite o numero da Agencia: ");
        saldo = ler.lerReal("Digite o saldo: ");
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
    
