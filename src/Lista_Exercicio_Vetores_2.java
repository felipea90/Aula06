import java.util.Scanner;

public class Lista_Exercicio_Vetores_2
{
    /*
        2. O professor Wuni Jim Yensonal precisa de um programa para ajudar com um problema simples: para uma turma com 50 alunos precisa calcular a média da sala e descobrir quais são os alunos que precisarão de um atendimento personalizado. O fluxo do programa deve ser o seguinte: 
        A. Digitar as 50 notas em um vetor e, para cada nota digitada, digitar o nome do aluno correspondente em outro vetor
        B. Calcular a média das notas digitadas
        C. Para cada uma das notas que foi digitada e ficou abaixo da média, exibir uma mensagem que diga “Chamar o aluno para conversar”
    */
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        int qtdSala;
        double media = 0;

        System.out.println("Favor informar a quantidade de alunos na sala:");
        qtdSala = leitor.nextInt();

        leitor.nextLine();

        double nota[] = new double[qtdSala];
               
        String aluno[] = new String[qtdSala];

        for (int i = 0; i < qtdSala; i++)
        {
            System.out.println("Digite o nome do " + (i+1) + "º aluno");
            aluno[i] = leitor.nextLine();

            System.out.println("Digite a nota do " + (i+1) + "º aluno");
            nota[i] = leitor.nextDouble();

            media = media + nota[i];

            leitor.nextLine();
        }

        media = media / qtdSala;

        System.out.println("A média da nota de todos os alunos é: " + media);

        for (int i = 0; i < qtdSala; i++)
        {
            if (nota[i] < media)
            {
                System.out.println("Chamar o aluno " + aluno[i] + " para conversar.");
            }
        }

        leitor.close();
    }    
}
