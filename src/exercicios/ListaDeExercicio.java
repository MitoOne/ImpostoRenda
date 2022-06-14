package exercicios;

import java.util.Scanner;

public class ListaDeExercicio {
	public static void main(String[] args) {

		/*
		 * 1 - faça um algoritmo que leia a idade de uma pessoa expressa em anos,meses e
		 * dias e mostre-a expressa em dias.Leve em consideração o ano com 365 dias eo
		 * mês com 30. (ex: 3anos, 2 meses e 15 = 1170 dias.)
		 */
		System.out.println("=============Conversor===============");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o Ano:");
		int ano = teclado.nextInt();
		System.out.println("");
		System.out.print("Insira o Mês:");
		int mes = teclado.nextInt();
		System.out.println("");
		System.out.print("Digite o dia:");
		int dia = teclado.nextInt();
		System.out.println("");
		int anoConvertido = (ano * 365) + (mes * 30) + dia;
		System.out.format("%d anos, %d meses e %d = %d dias . \n", ano, mes, dia, anoConvertido);
		System.out.println("==========================================");
		teclado.close();
	}
}