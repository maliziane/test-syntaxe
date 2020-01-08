package fr.gtm.syntaxe;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainMap {

	public MainMap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Map<String,Point> map = new HashMap<String, Point>();  //pas de doublons sur les Clés String
		
		for (int i=0; i<5;i++) {
			String key="point"+i;
			Point value = new Point(i,i);
			map.put(key, value);
		}
		Point p4=map.get("point4");
		System.out.println(p4);
System.out.println("========================================================================");
		System.out.println("iteration sur les clés");
		for (String key:map.keySet()) {
			System.out.println(key+ " = "+map.get(key));
			}
		
			System.out.println("========================================================================");
			System.out.println("itération sur les values");
			for(Point p:map.values()) {
				System.out.println(p);
			}
			System.out.println("========================================================================");
			System.out.println("itération sur entry");
			for(Entry<String,Point> entry: map.entrySet()) {
				String k = entry.getKey();
				Point v= entry.getValue();
				System.out.println(k+" = "+v);
			}
		
		}
		
		/*
		 * console
		 * Point [X=4, Y=4]
========================================================================
iteration sur les clés
point4 = Point [X=4, Y=4]
point0 = Point [X=0, Y=0]
point1 = Point [X=1, Y=1]
point2 = Point [X=2, Y=2]
point3 = Point [X=3, Y=3]
========================================================================
itération sur les values
Point [X=4, Y=4]
Point [X=0, Y=0]
Point [X=1, Y=1]
Point [X=2, Y=2]
Point [X=3, Y=3]
========================================================================
itération sur entry
point4 = Point [X=4, Y=4]
point0 = Point [X=0, Y=0]
point1 = Point [X=1, Y=1]
point2 = Point [X=2, Y=2]
point3 = Point [X=3, Y=3]
		 * 
		 * 
		 */
		
		
		
		
		
	}


