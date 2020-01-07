package fr.gtm.syntaxe;

import java.util.ArrayList;
import java.util.List;

public class MachineAFaireRouler {
//incomplet
	
	private List<Rouleable> list = new ArrayList<Rouleable>();
	
	public void add(Rouleable rouleable) {
		list.add(rouleable);
	}
	
	public void faireRouler() {
		for(Rouleable rouleable : list) {
			rouleable.rouler();
		}
	}
	
	public static void main(String[] args) {
		
	}
	
	
	
	
}
