package fr.gtm.syntaxe;


import java.util.HashSet;

import java.util.Set;

public class MainSet {
	
// par rapport a la list le set n'a pas de doublons
	
		public static void main(String[] args) {
			Set<Point> points = new HashSet<Point>();
			
			Point p1 = new Point(10,10);
			points.add(new Point(1,1));
			points.add(new Point(1,1)); //ça marche car reconnut comme 2 references objet differentes
			points.add(new Point(2,2));  // mais si ont met la methode hashcode et equals alors ça ne 
			points.add(new Point(3,3)); // met plus en double
			points.add(p1);
			points.add(p1); // Ca va pas ajouter le 2ieme car meme reference d'objet
			
			
			
			for (Point p:points) {  // "for each" peut modifier mais pas supprimer des éléments de la liste
				System.out.println(p);
	}
		}}

