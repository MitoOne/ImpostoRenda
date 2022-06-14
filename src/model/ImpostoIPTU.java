package model;

import java.util.Scanner;

public class ImpostoIPTU implements AplicarImposto {

	@Override
	public double aplicar(double valor) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("VOCÊ ESCOLHEU IPTU");
		System.out.println("");
		System.out.println("Digite o valor do imovel ");
		System.out.print(":");
		double valorIptu = teclado.nextDouble();

		if (valorIptu < 120000) {
			valor = (valorIptu * 0.07);

			System.out.println("Valor do IPTU anual: " + valor + " com desconto de R$ 0,00");

		} else if (valorIptu >= 120000 && valorIptu < 240000) {
			valor = ((valorIptu * 0.08) - 120);

			System.out.println("Valor do IPTU anual: " + valor + " com desconto de R$ 120,00");

		} else if (valorIptu >= 240000 && valorIptu < 360000) {
			valor = ((valorIptu * 0.09) - 360);

			System.out.println("Valor do IPTU anual: " + valor + " com desconto de R$ 360,00");
			
		} else if(valorIptu >= 360000 && valorIptu < 480000) {
			valor = ((valorIptu * 0.011)- 1080);
			
			System.out.println("Valor do IPTU anual: " + valor + " com desconto de R$ 1080,00");
			
		} else if(valorIptu >= 480000) {
			valor = ((valorIptu * 0.013) - 2040);
			
			System.out.println("Valor do IPTU anual: " + valor + " com desconto de R$ 2040,00");
		}
		teclado.close();

		return valor;

	}

}
