
package exerciciofixacaoprova;


public class ExercicioFixacaoProva 
{

    public static void main(String[] args) 
    {
       ContaEspecial conta1 = new ContaEspecial();
       ContaEspecial conta2 = new ContaEspecial("Leonardo", "201157", "22254", 1580f);
       ContaEspecial conta3 = new ContaEspecial("Ana Lucia", "478511", "22541", 1200f);
       
       
       ContaPoupanca conta4 = new ContaPoupanca("Edna", "201455", "110025", 1000f);
       ContaPoupanca conta5 = new ContaPoupanca("Maria das Graças", "784514", "254111", 4875f);     

       
       
       System.out.println(conta1.exibir() + "\n" + conta2.exibir() + "\n" + conta3.exibir() + "\n" + conta4.exibir() + "\n" + conta5.exibir() + "\n");

       
       
    }
}
