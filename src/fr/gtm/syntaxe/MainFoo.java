package fr.gtm.syntaxe;


public class MainFoo {

	
	public static void main(String[] args) {
Foo<Integer> foo= new Foo<>(132);   
//ici on dit à Foo qu'elle va fonctionner sur des String
//c'est une reification du type
int[]tab= new int[2];
String[] tabs = new String[2];
System.out.println(tab.getClass());
	}

}

