import java.util.Scanner;
public class Funciones {
    public static double f (double x){
        return x*x;
    }
    public static double f2 (double x){
        return Math.pow(x,2);
    }
    public static int suma (int x, int y){
        return x+y;
    }
    public static double areaRectangulo(double l1, double l2){
        return l1*l2;
    }
    public static void main(String[] args) {
        System.out.println(f(2));
        Scanner x= new Scanner(System.in);
        System.out.print("ingrese numero: ");
        double number=x.nextDouble();
        System.out.println(number+" elevado a la 2 es: "+f2(number));
        System.out.print("ingrese numero: ");
        int a=x.nextInt();
        System.out.print("ingrese el otro numero: ");
        int b=x.nextInt();
        System.out.println(a+" + "+b+" = "+suma(a,b));
        System.out.print("ingrese longitud de un lado: "); 
        int l1=x.nextInt();
        System.out.print("ingrese longitud del otro lado: ");
        int l2=x.nextInt();
        System.out.println("el area del rectángulo es: "+areaRectangulo(l1,l2));
        x.close();  
    }
}