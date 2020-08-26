package Laboratorio;

public class main {
	    
	    public static void main(String[] args){
	    	long inicio = System.currentTimeMillis();
	    	String a = "AYD";
		    String b = "AXD";
	        ADN adn = new ADN();
	        System.out.println(adn.lcsDNA(a, b));
	        long finale = System.currentTimeMillis();
	        System.out.println(finale-inicio);
	        ways w = new ways();
	        System.out.println(w.ways(3));
	    } 
}
