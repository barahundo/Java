import java.util.Scanner;
public class Problemas{
    public static int carne(int g, int G, int p){
        g=g*6;
        G=G*7;
        return g+G+p;
    }
    public static int vueltas(int pan, int leche, int huevos, int dinero){
        pan=pan*300;
        leche=leche*3300;
        huevos=huevos*350;
        int total= dinero-(pan+leche+huevos);
        return total;
    }
    public static double interes (double prestamo, int meses){
        for(int i = meses;i>0;i--){
            prestamo=(prestamo*0.03)+prestamo;
        }
        return prestamo;
    }
    public static int infeccion(int dias){
        int infectados=1;
        for(int i=1;i<=dias;i++){
            infectados*=2;
        }
        return infectados;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ingrese # de gallinas: ");
        int g=sc.nextInt();
        System.out.print("ingrese # de gallos: ");
        int G=sc.nextInt();
        System.out.print("ingrese # de Pollos: ");
        int p=sc.nextInt();
        System.out.println("El total de Carne es: "+carne(g, G, p)+" Kg");
        System.out.print("ingrese # de panes: ");
        int pan=sc.nextInt();
        System.out.print("ingrese # de Bolsas de leche: ");
        int leche=sc.nextInt();
        System.out.print("ingrese # de Huevos: ");
        int huevos=sc.nextInt();
        System.out.print("ingrese la denominacion del billete: ");
        int dinero=sc.nextInt();
        System.out.println("las vueltas son: $"+vueltas(pan, leche, huevos, dinero));
        System.out.print("cuanto $$$ desea prestado?: ");
        double prestamo=sc.nextDouble();
        System.out.print("por cuantos meses?: ");
        int meses=sc.nextInt();
        System.out.println("al final del periodo ud debe pagar: $"+interes(prestamo, meses));
        System.out.print("ingrese # de dias q dura la epidemia: ");
        int dias=sc.nextInt();
        System.out.print("el total de infectados al final del día "+dias+" es: "+infeccion(dias));
        sc.close();
    }
}