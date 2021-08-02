import static java.lang.System.in;

import java.util.Scanner;
public class pruebaEntrada{
    public static void main (String[] args){
        Scanner sc = new Scanner (in);
        System.out.println("ingresa tu nombre: ");
        String nombre= sc.nextLine();
        System.out.println("Hola "+nombre);
        sc.close();
    }
}