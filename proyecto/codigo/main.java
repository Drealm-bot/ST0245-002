
public class main
{
    
    public static void main(String[] args){
        try{
        String s = "test.csv";
        Leer a = new Leer();
        a.leerArchivo(s);
       }
       catch (Exception e){
           e.printStackTrace();
        }
    }
 }
