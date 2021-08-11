import java.util.ArrayList;
import java.util.Scanner;
import Cafe.Arabigo;
import Cafe.Cafe;
import Cafe.Robusta;
public class Inventario {
    //crear una Arrglo de objetos <Cafe>
    static ArrayList <Cafe> arreglo= new ArrayList<Cafe>();
    //objeto escner para leer las entradas
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {       
        System.out.println();
        //leyendo los datos de entrada y almacenandolos en la variable ln
        String ln=sc.nextLine();
        //separando los parametros tomando & como carater de ref. y almacenandolos en un array de Strs
        String []rv=ln.split("&");
        String opc= rv[0];
        while (!opc.equals("3")){        
            if (opc.equals("1")){
                int id= Integer.parseInt(rv[2]);
                float precio=Float.parseFloat(rv[3]);
                boolean molido=Boolean.parseBoolean(rv[4]);
                if ("Arabigo".equals(rv[1])){
                    //creando el objeto <Cafe> arabigo y anexandolo al arreglo de objetos
                    Arabigo ob=new Arabigo(id, precio, molido, rv[5], rv[6]);
                    arreglo.add(ob);
                }else if ("Robusta".equals(rv[1])){
                    float cant=Float.parseFloat(rv[5]);
                    //creando el objeto <Cafe> robusta y anexandolo al arreglo de objetos
                    Robusta ob=new Robusta(id, precio, molido, cant, rv[1]); 
                    arreglo.add(ob);             
                }
            }else if (opc.equals("2")){
                System.out.println("***Inventario de cafes***");
                //recorriendo el arreglo de objetos <Cafe> e imprimiendolos (toString)
                for(Cafe elm:arreglo){
                  System.out.println(elm);
                    }                
                }
                System.out.println();
                ln=sc.nextLine();
                rv=ln.split("&"); 
                opc= rv[0];
        }
        System.exit(0);        
    }
      
}
