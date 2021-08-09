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
           while (opc!="3"){        
            if (opc=="1"){
                int id= Integer.parseInt(rv[2]);
                float precio=Float.parseFloat(rv[3]);
                boolean molido=Boolean.parseBoolean(rv[4]);
                /*String n=Integer.toString(count);
                String variable="obj"+n;*/
                if (rv[1]=="Arabigo"){
                    Arabigo ob=new Arabigo(id, precio, molido, rv[5], rv[6]);
                    ob.impObj();
                }else if (rv[1]=="Robusta"){
                    float cant=Float.parseFloat(rv[5]);
                    Robusta ob=new Robusta(id, precio, molido, cant, rv[1]);
                    ob.impObj();
                }
            }else if (opc=="2"){
                //ob.impObj();
            }
            System.out.println();
            ln=sc.nextLine();
            rv=ln.split("&");         
        }
        sc.close();
        System.exit(0);
    }
}
