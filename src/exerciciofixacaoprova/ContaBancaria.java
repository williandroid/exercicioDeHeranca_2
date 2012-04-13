
package exerciciofixacaoprova;


public class ContaBancaria 
{
    protected String cliente;
    protected String numConta;
    protected String numAgencia;
    protected float saldo;
    
    
    public ContaBancaria(String cliente, String numConta, String numAgencia, float saldo) 
    {
        this.cliente = cliente;
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.saldo = saldo;
    }
    
    public ContaBancaria()
    {
        Teclado ler = new Teclado();
        cliente = ler.lerStrings("Digite o Cliente: ");
        numConta = ler.lerStrings("Digite o numero da Conta: ");
        numAgencia = ler.lerStrings("Digite o numero da Agencia: ");
        saldo = ler.lerReal("Digite o saldo: ");
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
        System.out.println("Realizado o deposito de: " + valor);
    }
    
    String exibir()
    {
        String dadosDaConta = "";
        dadosDaConta = dadosDaConta + "Cliente: " + cliente + "\n" + "Numero da Conta: " + numConta + "\n"; 
        dadosDaConta = dadosDaConta + "Numero da Agencia: " + numAgencia + "\n" + "Saldo: " + saldo + "\n";
        return dadosDaConta;
    }
    
    //_______Get e Set____
    
        public String getCliente() {
            return cliente;
        }

        public void setCliente(String cliente) {
            this.cliente = cliente;
        }

        public String getNumAgencia() {
            return numAgencia;
        }

        public void setNumAgencia(String numAgencia) {
            this.numAgencia = numAgencia;
        }

        public String getNumConta() {
            return numConta;
        }

        public void setNumConta(String numConta) {
            this.numConta = numConta;
        }

        public float getSaldo() {
            return saldo;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

    
    
}
