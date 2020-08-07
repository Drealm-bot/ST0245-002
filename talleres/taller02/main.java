package Taller_2_Datos;

public class main {
	static int[] cadena = {1,4,4,7,4,9};
	public static void main(String[] args) {
		Baldosas b = new Baldosas();
		Inventario i = new Inventario();
		Subgrupos s = new Subgrupos();
		System.out.print(b.euclide(154, 12));
		System.out.println();
		i.combinar(cadena, 9);
		System.out.println();
		s.combinations("Hola");
	}
	
}


