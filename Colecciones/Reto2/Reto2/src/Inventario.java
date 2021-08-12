import java.util.ArrayList;
import java.util.Scanner;
import Cafe.Arabigo;
import Cafe.Cafe;
import Cafe.Robusta;
public class Inventario {
    //iniciando colección de objetos <Cafe>
    static ArrayList <Cafe> arreglo= new ArrayList<Cafe>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        System.out.println();
        String ln=sc.nextLine();
        //separando la cadena de entrada tomando (&) como ref. y guandando en un arreglo de Str's
        String []rv=ln.split("&");
        String opc= rv[0];
        while (!opc.equals("3")){        
            if (opc.equals("1")){
                //haciendo cast de elementos del arreglo
                int id= Integer.parseInt(rv[2]);
                float precio=Float.parseFloat(rv[3]);
                boolean molido=Boolean.parseBoolean(rv[4]);
                if ("Arabigo".equals(rv[1])){
                    //creando objeto <Cafe> arabigo y agregando a coleccion de obj's <Cafe>
                    Arabigo ob=new Arabigo(id, precio, molido, rv[5], rv[6]);
                    arreglo.add(ob);
                }else if ("Robusta".equals(rv[1])){
                    float cant=Float.parseFloat(rv[5]);
                    //creando objeto <Cafe> robusta y agregando a coleccion de obj's <Cafe>
                    Robusta ob=new Robusta(id, precio, molido, cant, rv[1]); 
                    arreglo.add(ob);                  
                }
            }else if (opc.equals("2")){
                System.out.println("***Inventario de cafes***");
                //recorriendo la colección e imprimiendo cada Obj
                for(Cafe elm:arreglo){
                        System.out.println(elm.toString());
                    }                
                }
                //solicitando una nueva entrada
                System.out.println();
                ln=sc.nextLine();
                rv=ln.split("&"); 
                opc= rv[0];
        }
        System.exit(0);        
    }
}
