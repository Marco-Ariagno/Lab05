package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ricerca {

	/*private int N;
	private List<Parola> soluzione;

	public List<Parola> cerca(List<Lettera> lettereParola) {

		this.N = lettereParola.size();
		
		List<Lettera> parziale = new ArrayList<>();
		int livello = 0;

		this.soluzione = new ArrayList<Parola>();

		recursive(parziale, lettereParola, livello);

		return this.soluzione;

	}

	private void recursive(List<Lettera> parziale, List<Lettera> lettereParola, int livello) {
		if (livello == N) {
			soluzione.add(new Parola(parziale));
		} else {
			for (Lettera l : lettereParola) {
				parziale.add(l);
				List<Lettera> lettereRimanenti = new ArrayList<>(lettereParola);
				lettereRimanenti.remove(l);
				recursive(parziale, lettereRimanenti, livello + 1);
				parziale.remove(parziale.size() - 1);
			}
		}
	}*/
	
	/*private int N;
	private List<String> soluzione;

	public List<String> cerca(List<String> lettereParola) {

		this.N = lettereParola.size();
		
		List<String> parziale = new ArrayList<>();
		int livello = 0;

		this.soluzione = new ArrayList<String>();

		recursive(parziale, lettereParola, livello);

		return this.soluzione;

	}

	private void recursive(List<String> parziale, List<String> lettereParola, int livello) {
		if (livello == N) {
			soluzione.add(parziale.toString());
		} else {
			for (String l : lettereParola) {
				parziale.add(l);
				List<String> lettereRimanenti = new ArrayList<>(lettereParola);
				lettereRimanenti.remove(l);
				recursive(parziale, lettereRimanenti, livello + 1);
				parziale.remove(parziale.size() - 1);
			}
		}
	}*/
	
	private int N;
	private Set<Parola> soluzione;

	public Set<Parola> cerca(List<String> lettereParola) {

		this.N = lettereParola.size();
		
		List<String> parziale = new ArrayList<>();
		int livello = 0;

		this.soluzione = new HashSet<Parola>();

		recursive(parziale, lettereParola, livello);

		return this.soluzione;

	}

	private void recursive(List<String> parziale, List<String> lettereParola, int livello) {
		if (livello == N) {
			soluzione.add(new Parola(parziale));
		} else {
			for (String l : lettereParola) {
				parziale.add(l);
				List<String> lettereRimanenti = new ArrayList<>(lettereParola);
				lettereRimanenti.remove(l);
				recursive(parziale, lettereRimanenti, livello + 1);
				parziale.remove(parziale.size() - 1);
			}
		}
	}


}
