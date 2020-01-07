package fr.gtm.syntaxe;

import java.io.Serializable;

public class Ballon implements Rouleable, Serializable {

	
	@Override
	public void rouler() {
		System.out.println("le ballon roule");
	}

}
