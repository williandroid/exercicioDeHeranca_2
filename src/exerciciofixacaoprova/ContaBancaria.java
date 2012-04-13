
package exerciciofixacaoprova;


public class ContaBancaria 
{
    protected String cliente;
    protected int numConta;
    protected int numAgencia;
    protected float saldo;
    
    
    public ContaBancaria(String cliente, int numConta, int numAgencia, float saldo) 
    {
        this.cliente = cliente;
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(float valor)
    {
        
        if (valor > saldo)
        {
            System.out.println("Impossivel Sacar");
        }
        else if (valor <= saldo)
        {
            saldo -= valor;  
            System.out.println("Realizado o saque de: " + valor);
        }
    }
    
    public void depositar(float valor)
    {
        saldo += valor;
    }
    
    String exibir()
    {
        String dadosDaConta;
        dadosDaConta = "Cliente" + cliente + "\n" + "Numero da Conta" + numConta + "\n"; 
        dadosDaConta = "Numero da Agencia: " + numAgencia + "\n" + "Saldo: " + saldo + "\n";
        return dadosDaConta;
    }
    
    
}
