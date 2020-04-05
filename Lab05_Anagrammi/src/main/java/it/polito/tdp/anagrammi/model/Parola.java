package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parola {
	
	List<String> lettere;
	boolean corretta;
	
	public Parola(List<String> lettereParola) {
		lettere = new ArrayList<>(lettereParola);
		corretta=false;
	}
	
	public void add(String lettera) {
		lettere.add(lettera);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lettere == null) ? 0 : lettere.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parola other = (Parola) obj;
		if (lettere == null) {
			if (other.lettere != null)
				return false;
		} else if (!lettere.equals(other.lettere))
			return false;
		return true;
	}

	@Override
	public String toString() {
		String str="";
		for(String s:lettere) {
			str=str+s;
		}
		return str;
	}

	public List<String> getLettere() {
		return lettere;
	}

	public void setLettere(List<String> lettere) {
		this.lettere = lettere;
	}

	public boolean isCorretta() {
		return corretta;
	}

	public void setCorretta(boolean corretta) {
		this.corretta = corretta;
	}
	
	
	
	
	

}
