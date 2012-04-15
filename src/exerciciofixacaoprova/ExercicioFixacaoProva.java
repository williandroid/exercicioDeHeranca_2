
package exerciciofixacaoprova;


        

public class ExercicioFixacaoProva 
{
    
      static ContaEspecial conta1 = new ContaEspecial("Maria", "257844", "48775", 1500f);
      static ContaEspecial conta2 = new ContaEspecial("Leonardo", "201157", "22254", 1580f);
      static ContaEspecial conta3 = new ContaEspecial("Ana Lucia", "478511", "22541", 1200f);
       
      static ContaPoupanca conta4 = new ContaPoupanca("Edna", "201455", "110025", 1000f);
      static ContaPoupanca conta5 = new ContaPoupanca("Maria das Graças", "784514", "254111", 4875f);


    public static void main(String[] args) 
    {
        
        Teclado ler = new Teclado();        
        int escolha = menu1(); 
        
        if (escolha == 1)
        {
            String nome = ler.lerStrings("Nome: ");
            ContaBancaria cliente = buscaCli(nome);
            menu2(cliente);
        }
        else if(escolha == 2)
        {
            String num = ler.lerStrings("Conta: ");
            ContaBancaria conta = busca(num);
            menu2(conta);
            
        }
    }
        
        public static int menu1()
        {
            Teclado ler = new Teclado();
            System.out.println("[1] Acessar por Nome"); 
            System.out.println("[2] Acessar por Conta");
            int escolha = Teclado.lerInteiro("");
            return escolha;           
        }
        
        public static void menu2(ContaBancaria conta)
        {
            Teclado ler = new Teclado();
            int escolha;
            
            while(true)
            {
                System.out.println("Olá, "+conta.getCliente()+"\n[1]-Sacar \n[2]-Depositar\n"+
                "[3] - Mostrar Dados\n[4]Mostrar Novo Saldo Com Taxa de Rendimento");
                escolha = ler.lerInteiro("");

                if(escolha == 1)
                {
                    System.out.println("Valor: ");
                    float valor = Teclado.lerReal("");
                    conta.sacar(valor);
                    conta.exibir();               
                }
                else if (escolha == 2) 
                {
                    System.out.println("Valor");
                    float valor = Teclado.lerReal("");
                    conta.depositar(valor);
                    conta.exibir();
                }
                else if (escolha ==3)
                {
                    conta.exibir();
                }
                
                // if = 4 rever, não sei fazer

            }              
        } 
        
        public static void renderContaPoup(ContaPoupanca poup)
        {
        
        }
        
        public static ContaBancaria busca(String conta)
        {
            ContaBancaria c = null;
            if(conta == conta1.getNumConta())
            {
                c = conta1;
            }
            else if (conta == conta2.getNumConta())
            {
                c = conta2;
            }
            else if (conta == conta3.getNumConta())
            {
                c = conta3;
            }
            else if (conta == conta4.getNumConta())
            {
                c = conta4;
            }
            else if (conta == conta5.getNumConta())
            {
                c = conta5;
            }
            return c;
        }
        
        public static ContaBancaria buscaCli(String cliente)
        {
            ContaBancaria c = null;
            
            if(cliente == conta1.getCliente())
            {
                c = conta1;
            }
            else if(cliente == conta2.getCliente())
            {
                c = conta2;
            }
            else if(cliente == conta3.getCliente())
            {
                c = conta3;
            }
            else if(cliente == conta4.getCliente())
            {
                c = conta4;
            }
            else if(cliente == conta5.getCliente())
            {
                c = conta5;
            }
            
            return c;
        }
        
        
        
    
        
        
        
        
        
}
 
       

     


       
       
    