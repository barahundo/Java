package Patrones;
public class Patrones {
    public static void main(String[] args) {
        Caja <String> cj=new Caja<String>("juan carlos");
        System.out.println(cj.decorar());
        System.out.println(cj.obtener());       
    }

}
