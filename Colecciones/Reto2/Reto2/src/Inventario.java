import java.util.Arrays;
import java.util.Scanner;
public class Inventario {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String ln=sc.nextLine();
        String []rv=ln.split("&");
        System.out.println(Arrays.asList(rv));
    }
}
