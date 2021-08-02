import java.util.Scanner;
public class Lectura {
    public static double f (double x){
        return x*x;
    }
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        System.out.println("ingrese #: ");
        double number=x.nextDouble();
        System.out.println(f(number));
        x.close();
    }
}