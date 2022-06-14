package model;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 
		menu();
		
		String qualimposto = teclado.nextLine().toUpperCase();
	
		double valor = 0;
		AplicarImposto aplicarImposto = null;
		
		if (qualimposto.equalsIgnoreCase(TipoImposto.IRPF.toString())) {
			aplicarImposto = new ImpostoIRPF();			
		}else if (qualimposto.equalsIgnoreCase(TipoImposto.IOF.toString())) {
			aplicarImposto = new ImpostoIOF();	
		}else if (qualimposto.equalsIgnoreCase(TipoImposto.ITR.toString())) {
			aplicarImposto = new ImpostoITR();
		}else if(qualimposto.equalsIgnoreCase(TipoImposto.IPTU.toString())) {
			aplicarImposto = new ImpostoIPTU();
		}
		
		Imposto ip = new Imposto(qualimposto, aplicarImposto);
		
		ip.setValor(valor);
		
		teclado.close();
	}

	private static void menu() {
		System.out.println("DIGITE O TIPO DE IMPOSTO:");
		System.out.println("IRPF = Imposto de Renda de Pessoa Física");
		System.out.println("IOF = Imposto sobre Operações Financeiras");
		System.out.println("ITR = Imposto sobre a Propriedade Territorial Rural");
		System.out.println("IPTU =Imposto Predial e Territorial Urbano");
		System.out.print(":");
	}

}
