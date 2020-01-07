package fr.gtm.syntaxe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainPoint {

	public static void main(String[] args) {
		List<Point> points = new ArrayList<Point>();
		
		points.add(new Point(1,1));
		points.add(new Point(1,1));
		points.add(new Point(2,2));
		points.add(new Point(3,3));
		
		
		for (Point p:points) {  // "for each" peut modifier mais pas supprimer des éléments de la liste
			System.out.println(p);
		}
		System.out.println("=================================================");
		for (int i=0; i<points.size();i++) { // pareil sur la console lais là avec for on peut supprimer
			Point p= points.get(i);
			System.out.println(p);
		}
		System.out.println("=================================================");
		
		//parcours par iterateur
		Iterator<Point> it = points.iterator();
		while(it.hasNext()) { // tant que j'ai un suivant je recupere la valeur et je passe au suivant
			Point p = it.next(); // attention au depart curseur est avant le premier element donc 
			System.out.println(p); // next est bien le premier element donc on fait next et arrive sur 1ier element
		}
		
		
		
		
	}
	
	
	
}
