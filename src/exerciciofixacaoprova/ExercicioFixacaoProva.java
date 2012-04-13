
package exerciciofixacaoprova;


public class ExercicioFixacaoProva 
{

    public static void main(String[] args) 
    {
       ContaEspecial conta1 = new ContaEspecial("Lucas", 201045, 222211, 1500f);
       ContaEspecial conta2 = new ContaEspecial("Leonardo", 201157, 22254, 1580f);
       ContaEspecial conta3 = new ContaEspecial("Ana Lucia", 478511, 22541, 1200f);
       
       
       ContaPoupanca conta4 = new ContaPoupanca("Edna", 201455, 110025, 5400f);
       ContaPoupanca conta5 = new ContaPoupanca("Maria das Graças", 784514, 254111, 4875f);
       
       Teclado ler = new Teclado();
       
       
       conta1.exibir();
       conta2.exibir();
        String exibir = conta3.exibir();
       conta4.exibir();
       conta5.exibir();
       
       
       
       
       
       
    }
}
