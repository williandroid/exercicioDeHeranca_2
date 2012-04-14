
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
      
    } 
    
    public void buscar()
    {
        Teclado ler = new Teclado();
        
        String cliBusca;
        String numContaBusca;
        int opcao;
        
        cliBusca = ler.lerStrings("Digite o Cliente: ");
        numContaBusca = ler.lerStrings("Digite o numero da Conta: ");
        
        do
        {
            System.out.println("Cliente: " + cliente);
            System.out.println("Conta: " + numConta);
            System.out.println("\nDigite 1 SACAR");
            System.out.println("Digite 2 DEPOSITAR");
            System.out.println("Digite 3 EXIBIR DADOS");
            System.out.println("Digite 4 MOSTRAR SALDO ATUAL | CP");
            
            opcao = ler.lerInteiro("O que deseja fazer: ");
          
            
            if (opcao == 1)
            {
               sacar();
               System.out.println(exibir());
            }
            
            else if (opcao == 2)
            {
                depositar();
                System.out.println(exibir());
            }
            
            else if (opcao == 3)
            {
              System.out.println(exibir());
            }
            
            else 
            {
                break;
            }
            
                        
        }
        while(cliBusca.equalsIgnoreCase(cliente) || numContaBusca.equalsIgnoreCase(numConta));
       
            System.out.println("Usuário não Encontrado");     
       
    }      
    
    public void sacar()
    {
        Teclado ler = new Teclado();
        float valor = 0;
                
        valor = ler.lerReal("valor: ");
        
        if (valor > saldo)
        {
            System.out.println("Impossivel Sacar");
        }
        else if (valor <= saldo)
        {
            saldo = getSaldo() - valor;  
            System.out.println("Realizado o saque de: " + valor);
        }
    }
    
    public void depositar()
    {
        Teclado ler = new Teclado();
        float valor = 0;
        
        valor = ler.lerReal("Depositar: ");
        saldo = getSaldo() + valor;
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
