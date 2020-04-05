package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestRicerca {

	public static void main(String[] args) {
		
		/*Lettera l=new Lettera("m");
		Lettera h=new Lettera("c");
		List<Lettera> letter=new ArrayList<Lettera>();
		letter.add(l);
		letter.add(h);
		Parola p=new Parola(letter);
		System.out.println(p);*/

		/*String parola = "eat";
		List<Lettera> lettere = new ArrayList<>();
		for (int i = 0; i < parola.length(); i++) {
			char c = parola.charAt(i);
			lettere.add(new Lettera(Character.toString(c)));
		}
		Parola parole=new Parola(lettere);
		System.out.println(parole);
		
		Ricerca r=new Ricerca();
		List<Parola> risultato=r.cerca(lettere);
		System.out.println(risultato);
		System.out.println(risultato.size());*/
		
		String parola = "mamma";
		List<String> lettere = new ArrayList<>();
		for (int i = 0; i < parola.length(); i++) {
			char c = parola.charAt(i);
			lettere.add(Character.toString(c));
		}
		
		Ricerca r=new Ricerca();
		Set<Parola> risultato=r.cerca(lettere);
		
		System.out.println(risultato);
		System.out.println(risultato.size());
		
		for(Parola p:risultato) {
			System.out.println(p.toString());
		}
		
	}

}
