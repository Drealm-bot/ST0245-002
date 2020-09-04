package Taller_6_Datos;

public class main {
	static MiArrayList a;
	public static void main(String[] args) {
		a = new MiArrayList();
		System.out.println(a.size());
		for(int i = 0; i<20; i++) {
		a.add(4);
		}
		for(int i = 0; i<a.size(); i++) {
		System.out.println(a.get(i));
		}
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println(a.size());
		System.out.println("~~~~~~~~~~~~~~~~~");
		a.add(5, 8);
		for(int i = 0; i<a.size(); i++) {
			System.out.println(a.get(i));
			}
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println(a.size());
		System.out.println("~~~~~~~~~~~~~~~~~");
		a.del(5);
		for(int i = 0; i<a.size(); i++) {
			System.out.println(a.get(i));
			}
		System.out.println("~~~~~~~~~~~~~~~~~");
		System.out.println(a.size());
		System.out.println("~~~~~~~~~~~~~~~~~");
	}

}
