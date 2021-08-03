import java.util.Scanner;
public class Cadenas{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ingrese la palabra hola: ");
        String c=sc.nextLine();
        System.out.print("ingrese la palabra hola: ");
        String c2=sc.nextLine();
        System.out.println(c.equals(c2));//comparando cadenas
        System.out.println(c.equalsIgnoreCase(c2));//comaprando sin tener encuenta mayusculas o minusculas
        System.out.println(c2.contains(c));
        System.out.println(c2.length());
        System.out.println(c2.charAt(1));
        System.out.println(c2.substring(8,15));
        sc.close();
    }
}