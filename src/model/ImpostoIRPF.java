package model;

import java.util.Scanner;

public class ImpostoIRPF implements AplicarImposto {

	@Override
	public double aplicar(double valor) {
		System.out.println("VOCÊ ESCOLHEU IRPF");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor: ");
		valor = teclado.nextDouble();
			

		if (valor < 1903.98) {System.out.println("Isento de imposto");
		} else if (valor >= 1903.99 && valor < 2826.65) {
			valor = valor - (valor * 0.075);
			System.out.println("Valor com imposto IRPF: " + valor + " Com valor de 7,5% sobre o imposto ");
		} else if (valor >= 2826.66 && valor < 3751.05) {
			valor = valor - (valor * 0.15);
			System.out.println("Valor com imposto IRPF: " + valor + " Com valor de 15% sobre o imposto ");
		} else if (valor >= 3751.06 && valor < 4664.68) {
			valor = valor - (valor * 0.225);
			System.out.println("Valor com imposto IRPF: " + valor + " Com valor de 22,5% sobre o imposto ");
		} else if (valor >= 4664.69) {
			valor = valor - (valor * 0.275);
			System.out.println("Valor com imposo IRPF: " + valor + " Com valor de 27,5% sobre o imposto");
		}
		teclado.close();

		return valor;
	}

}
