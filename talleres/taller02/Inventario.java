package Taller_2_Datos;

public class Inventario {
	public boolean combinar(int[] cadena, int objetivo) {
		return combinar(0, cadena, objetivo);
	}
	private boolean combinar(int inicial, int[] cadena, int objetivo) {
		if((cadena[inicial] > objetivo) || (inicial>=cadena.length)) {
			combinar(inicial+1, cadena, objetivo);
			return false;
		}else if(cadena[inicial] == objetivo) {
			System.out.println(cadena[inicial] + " " + objetivo+"\nSe llegó al objetivo");
			return true;}
		else {
			System.out.println(cadena[inicial] + " " + objetivo);
			return combinar(inicial+1, cadena, objetivo-cadena[inicial]);
		}
		
	}
	
}
