import java.util.ArrayList;
public class main
{
    
    public static void main(String[] args){
        try{
        Node root;
        TreeCreation tree;
        Test t;
        leer a = new leer(); leer b = new leer();
        root = new Node();
        String train = "train_3.csv"; String test = "test_3.csv";
        a.leerArchivo(train); b.leerArchivo(test);
        long hi = System.currentTimeMillis();
        tree = new TreeCreation(a.getDatos());
        root = tree.create();
        long hf = System.currentTimeMillis();
        System.out.println((hf-hi)+" milisegundos");
        t = new Test();
        //hi = System.currentTimeMillis();
        t.asignacion(b.getDatos(), root);
        t.datos();
        //hf = System.currentTimeMillis();
        //System.out.println((hf-hi)+" milisegundos");
       }
       catch (Exception e){
           e.printStackTrace();
        }
    }
 }
