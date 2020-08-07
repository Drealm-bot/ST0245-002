package Taller_2_Datos;

public class Subgrupos {
	/**
	    * @param s se trata de una cadena de caracteres sobre la cual hallaremos las posibles combinaciones.
	    *
	    * El m�todo combinations se define para que solo se tenga que pasar el parametro s y no la cadena 
	    * vac�a necesaria para el metodo reursivo combinationsAux. Este metodo no se modifica.
	    * 
	    */
	    public static void combinations(String s) { 
	        combinationsAux("", s); 
	    }
	    
	    /**
	    * @param prefix, se utiliza como una variable auxiliar para guardar datos sobre el proceso.
	    * @param s se trata de una cadena de caracteres sobre la cual hallaremos las posibles combinaciones.
	    *
	    *
	    * El m�todo combinationsAux se encarga de encontrar las posibles combinaciones en la cadena s
	    * notese que el m�todo es "private" de modo que solo se puede llamar desde el interior de la clase pues
	    * el m�todo que lo representa es combinations.
	    * Para m�s detalles sobre modificadores de acceso:
	    * @see <a href="http://ayudasprogramacionweb.blogspot.com/2013/02/modificadores-acceso-public-protected-private-java.html"> modificadores </a>
	    *
	    */

	 

	    private static void combinationsAux(String prefix, String s) {  
	    if(s.length() == 0) {
	        System.out.println(prefix);
	    }else{
	        combinationsAux( prefix + s.charAt(0), s.substring(1));
	        combinationsAux( prefix, s.substring(1));
	    }
	    }
}
