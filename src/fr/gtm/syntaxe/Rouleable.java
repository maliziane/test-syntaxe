package fr.gtm.syntaxe;

public interface Rouleable {
	int vitesseMax = 260; //automatiquement se met en italique car statique (final)
	void rouler();   // les methodes d'interface sont automatiquement public et abstract
	
	
	default void roulerVite() {
		System.out.println("roule vite");
	}
	
	
}
