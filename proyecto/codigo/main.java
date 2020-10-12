
public class main
{
    
    public static void main(String[] args){
        try{
        String s = "test.csv";
        leer a = new leer();
        Gini g = new Gini();
        a.leerArchivo(s);
        g.gini(a.getInfo(), 65);
        System.out.println(g.gini);
       }
       catch (Exception e){
           e.printStackTrace();
        }
    }
 }
