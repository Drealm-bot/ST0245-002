package Taller_10_Datos;

import java.io.FileNotFoundException;

public class main {
	public static void main(String[] args) throws FileNotFoundException {
		int[] n;
		Read r = new Read();
		r.readFile("Personas.csv");
		n = r.number();
		BinarySearchTree a = new BinarySearchTree();
		for(int j = 0; j<n.length; j++) {
			a.insertar(n[j]);
		}
	}
}
