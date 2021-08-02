import java.util.Scanner;
public class Condicionales{
    public static double valorAbsoluto(double x){
        if (x>=0){
            return x;
        }
        return -x;
    }
    public static double maximo(double a, double b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static double vA2(double x){
        return (x>=0)?x:-x;
    } 
    public static void numeroConSigno(double x){
        if(x>0){
            System.out.print("+");
        }
        System.out.println(x);
    }
    public static boolean implicacion(boolean p, boolean q){
        if(p && !q){
            return false;
        }
        return true;
    }
    public static boolean implccn(boolean p, boolean q){
        return (p)?q:true;
    }
    public static double descuento(int cant, double precio){
        if (cant<=5){
            return cant*precio;
        }else if (cant>5&&cant<=10){
            return cant*precio*0.95;
        }else if (cant>10&&cant<=20){
            return cant*precio*0.9;
        }
        return cant*precio*0.8;
    }
    public static boolean vocalMinuscula (char c){
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ingrese #: ");
        double x=sc.nextDouble();
        System.out.println("el valor absoluto de "+x+" es "+valorAbsoluto(x));
        System.out.print("ingrese #: ");
        x=sc.nextDouble();
        System.out.print("ingrese el siguiente #: ");
        double y=sc.nextDouble();
        System.out.println("el # mayor entre "+x+" & "+y+" es "+maximo(x,y));
        System.out.println("el valor absoluto de "+x+" es "+vA2(x));
        numeroConSigno(y);
        System.out.println("v_v "+ implicacion(true, true));
        System.out.println("v_f "+ implccn(true, false));
        System.out.println("f_v "+ implicacion(false, true));
        System.out.println("f_f "+ implccn(false, false));
        System.out.println("4 prod a 10000 c/u "+ descuento(4, 1000));
        System.out.println("8 prod a 10000 c/u "+ descuento(8, 1000));
        System.out.println("15 prod a 10000 c/u "+ descuento(15, 1000));
        System.out.println("25 prod a 10000 c/u "+ descuento(25, 1000));
        System.out.print("ingrese letra: ");
        char c=sc.next().charAt(0);
        System.out.print("es la letra una vocal? "+vocalMinuscula(c));
        sc.close();
    }
}