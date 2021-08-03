import java.util.Scanner;
public class Cuadrado {
    public static double f (double x){
        return x*x;
    }
    public static double f2 (double x){
        return Math.pow(x,2);
    }
    public static void main(String[] args) {
        System.out.println(f(2));
        Scanner x= new Scanner(System.in);
        System.out.println("ingrese numero: ");
        double number=x.nextDouble();
        System.out.println(f2(number));
        x.close();       
    }
}