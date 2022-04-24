package teste;

import java.util.Scanner;

public class Menu {

	float n1, n2, media, diferenca, produto, divisao;
	Scanner sc = new Scanner(System.in);
	
	public void escolhaMenu() 
	{
		System.out.println("Equação");
		System.out.println("Escolha :");
		
		System.out.println("\n1) Media entre numeros"
				+ "\n2) diferença entre numeros"
				+ "\n3) produto entre numeros"
				+ "\n4) divisao entre numeros");
		
		int op = sc.nextInt();
		
		switch (op) {
		case 1: 
			escolhaNumeros();
			calculaMedia();
			System.out.println("Sistema encerrado");
			break;
		case 2:
			escolhaNumeros();
			calculaDiferenca();
			System.out.println("Sistema encerrado");
			break;
		case 3: 
			escolhaNumeros();
			calculaProduto();
			System.out.println("Sistema encerrado");
			break;
		case 4:
			escolhaNumeros();
			calculaDivisao();
			System.out.println("Sistema encerrado");
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Erro nao foi possivel concluir operação");
		}

	}
	
	public void escolhaNumeros() 
	{
		System.out.println("digite o primeiro número");
		n1 = sc.nextFloat();
		System.out.println("digite o segundo número");
		n2 = sc.nextFloat();
	}
	
	public void calculaMedia() 
	{
		media = (n1+n2)/2;
		System.out.println("A media entre os numeros é : " + (media));
	}
	
	public void calculaDiferenca() 
	{
		diferenca = n2 - n2;
		System.out.println("A diferença entre os numeros é : " + (diferenca));
	}
	public void calculaProduto() 
	{
		produto = n1 * n2;
		System.out.println("O produto entre os numeros é : " + (produto));
	}
	public void calculaDivisao() 
	{
		media = n1/n2;
		System.out.println("A Divisao entre os numeros é : " + (divisao));
	}
	
	
}
