import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		double total=0;
		int qtd;

		System.out.println("Informe a quantidade de alunos:");
		qtd = leitor.nextInt();

		double alunos[] = new double[qtd];

		System.out.println("O vetor tem tamanho " + alunos.length);
		
		for (int i = 0; i < alunos.length; i++)
		{
			System.out.println("Digite o consumo do " + (i+1) + "º aluno.");
			alunos[i] = leitor.nextDouble();
			total = total + alunos[i];
		}
			
		for (int i = 0; i < alunos.length; i++)
		{
			System.out.println("O aluno " + (i+1) + " consumiu R$ " + alunos[i]);
		}

		System.out.println("O total de consumo de todos os alunos foi de R$" + total);
		
		leitor.close();

	}
}
