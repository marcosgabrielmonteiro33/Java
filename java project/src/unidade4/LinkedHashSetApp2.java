package unidade4;


import java.util.LinkedHashSet;

public class LinkedHashSetApp2 {

	public static void main(String[] args) {
		LinkedHashSet<String> lista = new LinkedHashSet<>() ;
		lista.add("vermelho");
		lista.add("verde");
		lista.add("verde");
		lista.add("amarelo");
		System.out.println(lista);
	}

}
