import java.util.Scanner;
import Cafe.Arabigo;
import Cafe.Cafe;
import Cafe.Robusta;
public class Inventario {
    public static void main(String[] args) throws Exception {
        Cafe arreglo[]= new Cafe[100];
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String ln=sc.nextLine();
        String []rv=ln.split("&");
        String opc= rv[0];
           while (!opc.equals("3")){        
            if (opc.equals("1")){
                int id= Integer.parseInt(rv[2]);
                float precio=Float.parseFloat(rv[3]);
                boolean molido=Boolean.parseBoolean(rv[4]);
                if ("Arabigo".equals(rv[1])){
                    Arabigo ob=new Arabigo(id, precio, molido, rv[5], rv[6]);
                    arreglo[i]=ob;
                    i++;
                }else if ("Robusta".equals(rv[1])){
                    float cant=Float.parseFloat(rv[5]);
                    Robusta ob=new Robusta(id, precio, molido, cant, rv[1]); 
                    arreglo[i]=ob;
                    i++;                   
                }
            }else if (opc.equals("2")){
                System.out.println("***Inventario de cafes***");
                for(int j=0;j<arreglo.length;j++){
                    if(arreglo[j]!=null){
                        arreglo[j].impObj();
                    }                
                }
            }
            System.out.println();
            ln=sc.nextLine();
            rv=ln.split("&"); 
            opc= rv[0];        
        }
        sc.close();
        System.exit(0);
    }
}
