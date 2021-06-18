import java.util.Scanner;

public class Lista_Exercicio_Vetores_1 
{
    /*
        1. Faça um programa que permita ao usuário digitar 30 atividades que ele realizou no dia. Ao final, o programa deve possibilitar que o usuário escolha se quer exibir as atividades na ordem em que digitou ou em ordem reversa. 
    */
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        int escolha, qtd;

        System.out.println("Informe quantas atividades realizou no dia:");
        qtd = leitor.nextInt();

        leitor.nextLine();

        String atividades[] = new String[qtd];

        for(int i=0; i<atividades.length;i++) {
            System.out.println("Por favor, insira a " + (i+1) + "ª atividade realizada hoje");
            atividades[i] = leitor.nextLine();
        }

        System.out.println("Escolha como quer exibir as atividades.");
        
        System.out.println("1 - Crescente \n2 - Decrescente");
        escolha = leitor.nextInt();

        if (escolha == 1)
        {
            System.out.println("As atividades foram:");

            for (int i=0; i < atividades.length; i++)
            {
                System.out.println(atividades[i]);
            }
        }
        else if (escolha == 2)
        {
            System.out.println("As atividades foram:");

            for (int i = atividades.length-1; i >= 0; i--)
            {
                System.out.println(atividades[i]);
            }
        }
        else
        {
            System.out.println("Opção Inválida!");
        }

        leitor.close();
    }    
}
