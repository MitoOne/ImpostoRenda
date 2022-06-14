package model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ImpostoITR implements AplicarImposto {
	@Override
	public double aplicar(double valor) {
		BigDecimal  areatributavel;
		BigDecimal  areaimovel;
		BigDecimal  areavtn;
		BigDecimal aliquota = new BigDecimal(0.07);
	
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("VOCÊ ESCOLHEU ITR");
		System.out.println("");
		
		System.out.println("CALCULO DO VALOR DA TERRA NUA:");
		System.out.println("");
		System.out.println("Digite a área tributavel   Ex: 55,0");
		System.out.print(":");
		
		areatributavel = teclado.nextBigDecimal();
		
		System.out.println("");
		System.out.println("Digite  a área total do imovel   Ex: 85,0 ");
		System.out.print(":");
		
		 areaimovel = teclado.nextBigDecimal();
		
		System.out.println("");
		System.out.println("Qual eo valor da terra nua  Ex 100000,00");
		System.out.print(":");
		
		 areavtn = teclado.nextBigDecimal();
		
		//valor = 0.07 * (areavtn *(areatributavel / areaimovel));
		 BigDecimal valorD = (aliquota.multiply(areavtn.multiply(areatributavel.divide(areaimovel,1,RoundingMode.HALF_UP))));
		 String valorFormatado = String.format("%.2f",valorD);
		
		 System.out.println("valor do Imposto: " + valorFormatado);
		 teclado.close();
		return valor;
	}
	

}
