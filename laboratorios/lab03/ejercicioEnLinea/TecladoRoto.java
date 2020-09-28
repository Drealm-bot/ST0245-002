package Laboratorio_3;
import java.util.LinkedList;

public class TecladoRoto {
	public static void tecladoRoto(String a) {
		LinkedList<Character> car = new LinkedList<>();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i<a.length(); i++) {
			car.add(a.charAt(i));
		}
		car.add(']');
		
		for(int i = 0; i<car.size(); i++) {
			if(car.get(i).equals('[')) {
				for(int j = i; j<car.size(); j++) {
					if(car.get(j).equals(']')) {
						for(int k = i; k<=j; k++) {
							char aux;
							aux = car.get(j);
							car.remove(j);
							car.addFirst(aux);
						}
						i=j+1;
						}else if(car.get(j).equals('[')){
							for(int k = i; k<j; k++) {
								char aux;
								aux = car.get(j-1);
								car.remove(j-1);
								car.addFirst(aux);
							}
							i=j;
						}
					}
				}
		
			else if(car.get(i).equals(']')) {
				for(int j = i; i < car.size(); j++) {
					if(car.get(j).equals('[')){
						for(int k = i; k<j; k++) {
							char aux;
							aux = car.get(j-1);
							car.remove(j-1);
							car.addFirst(aux);
						}
						i=j;
					}else if(car.get(j).equals('[')) {
						for(int k = i; k<j; k++) {
							char aux;
							aux = car.get(j-1);
							car.remove(j-1);
							car.addFirst(aux);
						}
						i=j;
					}
				}
			}
		}
//		car.remove(car.size()-1);
		for(int i = 0; i<car.size(); i++) {
			if(!(car.get(i).equals('['))&&!(car.get(i).equals(']')))
			sb.append(car.get(i));
		}
		System.out.println(sb.toString());
		}
	}
	
