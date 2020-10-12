import java.util.ArrayList;
public class Gini
{
    ArrayList<estudiante> e, exito, fracaso;
    double gini = 0;
    
    public double gini(ArrayList<String> info, int var){
        e = new ArrayList<>();
        exito = new ArrayList<>();
        fracaso = new ArrayList<>();
        for(int i = 1; i<info.size(); i++){
            estudiante f = new estudiante();
            f.asignar(info, i);
            e.add(f);
            if(f.exito.equals("1")){
                exito.add(f);
            }else fracaso.add(f);
        }
        switch(var){
            case 65:
                double m, M, aux, val, Iizq, Ider;
                int nod = 0, nid = 0, noi = 0, nii = 0;
                m = Double.parseDouble(e.get(0).lenguaje);
                M = Double.parseDouble(e.get(0).lenguaje);
                for(int i = 0; i<e.size(); i++){
                    aux = Double.parseDouble(e.get(i).lenguaje);
                    if(aux>M){
                        M = aux;
                    }
                    if(aux<m){
                        m = aux;
                    }
                }
                Double medio = (m+M)/2;
                for(int i = 0; i<exito.size(); i++){
                    val = Double.parseDouble(e.get(i).lenguaje);
                    if(val<medio){
                        nii++;
                    }else if(val>=medio){
                        nid++;
                    }
                }
                for(int i = 0; i<fracaso.size(); i++){
                    val = Double.parseDouble(e.get(i).lenguaje);
                    if(val<medio){
                        noi++;
                    }else if(val>=medio){
                        nod++;
                    }
                }
                Iizq = 1-((Math.pow(noi,2)/Math.pow((noi+nii),2))+(Math.pow(nii,2)/Math.pow((noi+nii),2)));
                Ider = 1-((Math.pow(nod,2)/Math.pow((nod+nid),2))+(Math.pow(nid,2)/Math.pow((nod+nid),2)));
                gini = ((Iizq*(noi+nii))+(Ider*(nod+nid)))/((noi+nii)+(nod+nid));
        }
        return gini;
    }
}
