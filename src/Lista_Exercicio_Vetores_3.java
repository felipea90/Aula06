import java.util.Random;
import java.util.Scanner;

public class Lista_Exercicio_Vetores_3 
{
    /*
    3. Faça um algoritmo que gere aleatoriamente através de um laço de repetição PARA um vetor de 50 elementos inteiros (entre 0 - 9), calcule e exiba:
        • A quantidade de números entre 3 e 7;
        • Quantidade de números pares;
        • A quantidade de números menores que 3;
        • Quantidade de números ímpares.
    Obs.: O vetor com os 50 elementos deve ser impresso na tela também.
    */ 
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        int qtd, entre=0, menor=0, par=0, impar=0;

        System.out.println("Informe a quantidade de elementos para o algoritimo randomico.");
        qtd = leitor.nextInt();

        Random gerador = new Random();

        int elementos[] = new int[qtd];

        System.out.println("Os elementos criados foram:");

        for (int i = 0; i < qtd; i++)
        {
            elementos[i] = gerador.nextInt(9);

            System.out.println(elementos[i]);

            if (elementos[i] > 3 && elementos[i] < 7)
            {
                entre++;
            }

            if (elementos[i] < 3)
            {
                menor++;
            }

            if (elementos[i] % 2 == 0)
            {
                par++;
            }
            else
            {
                impar++;
            }
        }
        
        System.out.println("Existem " + entre + " números entre 3 e 7.");

        System.out.println("Existem " + menor + " números menor do que 3.");

        System.out.println("Existem " + par + " números pares.");

        System.out.println("Existem " + impar + " números ímpares.");

        leitor.close();

    }    
}
