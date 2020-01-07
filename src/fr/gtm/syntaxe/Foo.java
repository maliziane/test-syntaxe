package fr.gtm.syntaxe;

public class Foo<T> {  // parametrage de type pour la classe
	 
	private T bar;   //on connait pas encore le type de T qui sera manipulé par Foo
	public Foo(T t) {
		bar=t;
		// TODO Auto-generated constructor stub
	}

}
