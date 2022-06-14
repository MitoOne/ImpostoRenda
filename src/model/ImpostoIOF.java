package model;

import java.util.Scanner;

public class ImpostoIOF implements AplicarImposto {
	
	Scanner teclado2 = new Scanner(System.in);

	private int compraIof;

	@Override
	public double aplicar(double valor) {
		System.out.println("VOCÊ ESCOLHEU IOF");
		System.out.println("");
		System.out.println("A COMPRA FOI FEITA:");
		System.out.println("1: Exterior");
		System.out.println("2:Brasi");
		System.out.println(":");
		compraIof = teclado2.nextInt();
		switch (compraIof) {
		case 1:
			valor = valor - (valor * 0.0638);

			System.out.println("O valor com imposto atribuido: " + valor);
			break;
		case 2:
			System.out.println("Não há cobranças com compras de cartão de crédito");
			System.out.println("Dentro do pais não pagam IOF");
			break;
		default:
			System.out.println("ERRO: NUMERO DIGITADO INCORRETO!!!");}
		return valor;
	}

}
