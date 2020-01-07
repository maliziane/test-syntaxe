package fr.gtm.syntaxe;


public interface Compare<T> { // interface pour comparer 2 objets de meme type T
	
	/**                       
	 * O.compare(o1)
	 * @param t
	 * @return
	 * 		   -1 si o<o1 <br>
	 * 			0 si o==o1 <br>
	 * 			1 si o>o1 <br>
	 */
	int comparer(T t);
	
	default boolean isPlusPetit(T t) {         	//depuis JDK8 possible de coder sur methodes default
		return this.comparer(t)<0;		//retourne true si objet comparé est bien plus petit que t
										//this est le futu objet comparé avec t
	}									//en interface classique ecrire boolean isPlusPetit(T t)  ;
	
	
}
