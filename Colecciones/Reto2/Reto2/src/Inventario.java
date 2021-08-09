import java.util.Scanner;
import Cafe.Arabigo;
import Cafe.Robusta;
public class Inventario {
    public static void main(String[] args) throws Exception {
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
                /*String n=Integer.toString(count);
                String variable="obj"+n;*/
                if ("Arabigo".equals(rv[1])){
                    Arabigo ob=new Arabigo(id, precio, molido, rv[5], rv[6]);
                    ob.impObj();
                }else if ("Robusta".equals(rv[1])){
                    float cant=Float.parseFloat(rv[5]);
                    Robusta ob=new Robusta(id, precio, molido, cant, rv[1]); 
                    ob.impObj();                   
                }
            }else if (opc.equals("2")){
                //ob.impObj();
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
