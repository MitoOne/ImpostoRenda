package estudos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays {
	public static void main(String[] args) {
		
		String nome1 = "Thomas";
		String nome2 = "Sensei";
		String nome3 = "Shazam";
		String nome4 = "madara";
		
		// criando a list 
		List<String> nomes = new ArrayList<>();
		nomes.add(nome1);
		nomes.add(nome2);
		nomes.add(nome3);
		nomes.add(nome4);
		System.out.println(nomes);
		
		// utilizando o for
		for( String nome: nomes) {
			System.out.println(nome);
		}
		
		System.out.println("");
		
		// acessando elementos
		String segundoNome = nomes.get(1);
		System.out.println(segundoNome);
		
		
		System.out.println("");
		
		//podemos limitar o nosso for
		for(int i=0; i < nomes.size(); i++) {
			System.out.println( i + " " + nomes.get(i) );
		}
		
		System.out.println("");
		
		//Metodo foreach "Para cada"
		nomes.forEach(nome ->{
			System.out.println("Percorrendo");
			System.out.println("Nome " + nome + " X");
			});
		
		System.out.println("");
		
		//Ordenando a lista
		
		// praticamente faz com que os valores da lista fiquem ordenadas
		Collections.sort(nomes);
		System.out.println("Lista Ordenada");
		System.out.println(nomes);

		
		
	
	}

}
