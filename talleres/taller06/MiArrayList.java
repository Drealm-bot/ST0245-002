package Taller_6_Datos;

import java.util.Arrays;

/**
 * La clase MiArrayList tiene la intenci�n de representar un objeto que simule el comportamiento
 * de la clase ya implementada "ArrayList"
 * es claro que no se puede utilizar dicha estructura ya utilizada dentro de este ejercicio. 
 * Para m�s informaci�n de la clase ArrayList:
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
 * 
 * 
 * @author Mauricio Toro, Andres Paez
 * @version 1
 */

public class MiArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[]; 
    
    /**
    * El metodo constructor se utiliza para incializar
    * variables a valores neutros como 0 o null.
    * El contructor no lleva par�metros en este caso.
    */
    public MiArrayList() {
        this.size = 0;
        this.elements = new int[DEFAULT_CAPACITY];
    }     

    
    /**
    * Tiene la intenci�n de retornar la longitud del objeto
    * @return longitud del objeto
    *
    * El size esta influenciado por las funciones add y del
    */
    public int size() {
        return size;
    }   
    
    /** 
    * @param e el elemento a guardar
    * Agrega un elemento e a la �ltima posici�n de la lista
    *
    */
    public void add(int e) {
    	int lastPosition = size;
        if(size>=elements.length) {
        	int elem[] = new int[elements.length+DEFAULT_CAPACITY];
        	for(int i = 0; i<elements.length;i++) {
        		elem[i] = elements[i];
        	}
        	elements = elem;
        }
        elements[lastPosition] = e;
        size++;
    }    
    
    
    /** 
    * @param i es un �ncide donde se encuentra el elemento posicionado
    * Retorna el elemento que se encuentra en la posici�n i de la lista.
    *
    */
    public int get(int i) throws IndexOutOfBoundsException{
    	if (i<0 || i >= size) {
    		throw new IndexOutOfBoundsException("Index : "+ i);
    		} else {
    		return elements[i];
    		}
    }
    
    
    /**
    * @param index es la posicion en la cual se va agregar el elemento
    * @param e el elemento a guardar
    * Agrega un elemento e en la posici�n index de la lista
    *
    */
    public void add(int index, int e) {
    	if(index>size) {
    		add(e);
    	}else {
    		add(e);
    		for(int i = index; i<=size; i++) {
    			int a = elements[i];
    			elements[i] = e;
    			e = a;
    		}
    	}
    } 

    /**
    * @param index es la posicion en la cual se va eliminar el elemento
    *
    * ELimina el elemento  en la posici�n index de la lista
    *
    */
    public void del(int index){
    	if(index>size) {
    		System.out.println("No se encuentra dentro de los l�mites del arreglo");
    	}else {
    		for(int i = index; i<size; i++) {
    			int a = elements[i+1];
    			elements[i] = a;
    			}
    		elements[size] = 0;
    		size--;
        	}
    }
}
