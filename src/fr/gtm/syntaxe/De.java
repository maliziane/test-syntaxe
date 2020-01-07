package fr.gtm.syntaxe;

import java.util.Random;

public class De implements Rouleable, Compare<De> { //incomplet
	private int valeur;
	private static Random random= new Random(); //static car partagé entre toutes les instances
	
	
	public int getValeur() {
		return valeur;
	}
	
	public void lancer() {
		valeur=random.nextInt(6)+1;
	}
	
	
	public void rouler() {
		System.out.println("le dé roule");
	}
	
	
	public int comparer(De t) {
		return this.valeur-t.valeur;
		
	}
	
	}
	
	