import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Lista_Exercicio_Vetores_4 
{
    /*
    4. Considere a criação de um vetor de 50 posições chamado vetCarrinhoValores que servirá para armazenar os valores de produtos comprados por um cliente, e outro vetor de 50 posições chamado vetCarrinhoNomes que servirá para armazenar os nomes de produtos comprados por um cliente.
    Crie uma estrutura de menus para que o programa tenha as seguintes funcionalidades:

        • Digitar o nome de um produto e seu preço. (Quando não for mais possível inserir itens, deve ser exibida a mensagem: “Carrinho cheio”)
        • Remover um produto através de seu nome. (O nome do produto deve ser substituído por “” e o preço por 00. A posição não poderá ser reutilizada para armazenar novos valores)
        • Calcular o valor total da compra
        • Exibir a quantidade de produtos comprados
        • Exibir o nome do produto de maior valor (Em caso de produtos de igual valor, escolher uma das ocorrências)
        • Exibir o nome de cada produto ao lado de seu preço.
    */
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        int qtd, comprado=0, opcao=0;
        double totalCompra=0, maiorValor=0;
        String nomeMaiorValor = "";
        String nomeRemover = "";
        boolean carrinhoCheio = false;

        System.out.println("Informe a quantidade de posições que serão utilizadas no vetor:");
        qtd = leitor.nextInt();

        leitor.nextLine();

        double vetCarrinhoValores[] = new double[qtd];
        String vetCarrinhoNomes[] = new String[qtd];

        while (opcao != 7)
        {
            System.out.println("Menu do carrinho de compras, escolha a opção desejada:");
            System.out.println("1 - Escolher o Produto.");
            System.out.println("2 - Remover um Produto.");
            System.out.println("3 - Calcular o valor da compra.");
            System.out.println("4 - Exibir a Quantidade de Produtos Comprados.");
            System.out.println("5 - Exibir o nome do produto de maior valor.");
            System.out.println("6 - Exibir o nome de cada produto ao lado de seu preço.");
            System.out.println("7 - Encerrar a compra...");
    
            opcao = leitor.nextInt();
    
            leitor.nextLine();
            
            switch(opcao)
            {
                case 1:
                    if (carrinhoCheio == false)
                    {

                        for (int i = 0; i < qtd; i++)
                        {
                            System.out.println("Digite o nome de um produto:");
                            vetCarrinhoNomes[i] = leitor.nextLine();

                            System.out.println("Digite o preço do produto:");
                            vetCarrinhoValores[i] = leitor.nextDouble();

                            leitor.nextLine();

                            if (vetCarrinhoValores[i] > maiorValor )
                            {
                                maiorValor = vetCarrinhoValores[i];
                                nomeMaiorValor = vetCarrinhoNomes[i];
                            }

                            totalCompra = totalCompra + vetCarrinhoValores[i];

                            comprado++;

                            if (i == qtd -1)
                            {
                                carrinhoCheio = true;
                                System.out.println("Carrinho Cheio.");
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Carrinho Cheio.");
                    }
                break;

                case 2:
                    System.out.println("Informe o nome do produto que deseja remover:");
                    nomeRemover = leitor.nextLine();

                    leitor.nextLine();

                        for (int i = 0; i < qtd; i++)
                        {
                            if (nomeRemover.equalsIgnoreCase(vetCarrinhoNomes[i]))
                            {
                                totalCompra = totalCompra - vetCarrinhoValores[i];

                                vetCarrinhoNomes[i] = "";
                                vetCarrinhoValores[i] = 0;

                                comprado--;
                            }
                        }
                break;

                case 3:
                    System.out.println("O valor Total da compra é R$ " + totalCompra);
                break;

                case 4:
                    System.out.println("O total de items no seu carrinho é de " + comprado + " produtos.");
                break;

                case 5:
                    System.out.println("O produto " + nomeMaiorValor + " possui o maior valor do carrinho.");
                break;

                case 6:
                    for (int i = 0; i < qtd; i++)
                    {
                        System.out.println("Produto: " + vetCarrinhoNomes[i] + " --- Valor R$ " + vetCarrinhoValores[i]);
                    }
                break;

                case 7:
                    System.out.println("Cancelando a compra...");
                break;

            }
        }


        leitor.close();
    }    
}
