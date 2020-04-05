package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import it.polito.tdp.anagrammi.dao.ParolaDAO;

public class Model {

	private ParolaDAO pdao;
	private List<Parola> anagCorretti;
	private List<Parola> anagErrati;

	public Model() {
		pdao = new ParolaDAO();
		anagCorretti= new ArrayList<Parola>();
		anagErrati= new ArrayList<Parola>();
	}

	public void doAnagramma(String parola) {
		List<String> lettere = new ArrayList<>();
		for (int i = 0; i < parola.length(); i++) {
			char c = parola.charAt(i);
			lettere.add(Character.toString(c));
		}

		Ricerca r = new Ricerca();
		Set<Parola> anagrammi = r.cerca(lettere);
		for(Parola p:anagrammi) {
			Parola an=pdao.anagrammiOK(p);
			if(an.isCorretta()) {
				anagCorretti.add(an);
			}else {
				anagErrati.add(an);
			}
		}
	}
	
	public List<Parola> getAnagrammiOk(){
		return anagCorretti;
	}
	
	public List<Parola> getAnagrammiNo(){
		return anagErrati;
	}

}
