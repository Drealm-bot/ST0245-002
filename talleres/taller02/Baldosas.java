package Taller_2_Datos;

public class Baldosas {
	public int euclide(int largo, int ancho) {
		if((largo%ancho == 0) || (ancho%largo == 0)){
			int baldosa = largo;
			return baldosa;
		} else if(largo < ancho) {
			System.out.println(ancho +" = "+ largo +" . "+ ancho/largo + " + " + ancho%largo);
			int baldosa = euclide(ancho%largo, largo);
			return baldosa;
		}else {
			System.out.println(largo +" = "+ ancho + " . " + largo/ancho +" + " +largo%ancho);
			int baldosa = euclide(largo%ancho, ancho);
			return baldosa;
		}
	}
}
