import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class leer
{
    ArrayList<String> info = new ArrayList<>(); 
    public void leerArchivo(String nombreArchivo) throws FileNotFoundException {
        Scanner archivo = new Scanner(new File(nombreArchivo));
        while(archivo.hasNextLine()) {
            String linea = archivo.nextLine();
            info.add(linea);
        }
    }
    public void imprimirArchivo(){
        for(int i = 0; i<info.size(); i++){
            System.out.println(info.get(i));
        }
    }
    public ArrayList<String> getInfo(){
        return info;
    }
}
