import java.util.Scanner;
public class prblmCadenas{
    public static int cuentaLetra(char c, String c2){
        char l=c;
        char l2;
        int cont=0;
        for(int i=0;i<c2.length();i++){
            l2=c2.charAt(i);
            if(l==l2){
                cont++;
            }
        }
        return cont;
    }
    public static boolean sonIguales(String c,String c2){
        if(c.length()==c2.length()){
            return c.equalsIgnoreCase(c2);
        }
        return false;
    }
    public static String invertirCadena(String c){
        String v="";
        for (int i=c.length()-1;i>=0;i--){
            v=v+c.charAt(i);
        }
        return v;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*System.out.print("ingrese un texto: ");
        String c2=sc.nextLine();
        System.out.print("ingrese una letra: ");
        char c=sc.next().charAt(0);
        System.out.println(cuentaLetra(c,c2));*/
        System.out.print("ingrese un texto: ");
        String t=sc.nextLine();
        System.out.print("ingrese otro texto: ");
        String t1=sc.nextLine();
        System.out.println("los textos son = ? "+sonIguales(t, t1));
        System.out.println(invertirCadena(t));
        sc.close();
    }
}