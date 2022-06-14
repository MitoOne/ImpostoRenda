package estudos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestListaDeAula {
	public static void main(String[] args) {
		Aula a1 = new Aula("Aula de portugues", 21);
		Aula a2 = new Aula("Aula de ingles", 20);
		Aula a3 = new Aula("Aula de informatica", 15);
		
		
		
		
		ArrayList<Aula> aulinhas = new ArrayList<>();
		aulinhas.add(a1);
		aulinhas.add(a2);
		aulinhas.add(a3);
		
		System.out.println(aulinhas);
		
		
			
		aulinhas.sort(Comparator.comparing(Aula:: getTitulo));
		
		System.out.println(aulinhas);
	}
}
