package Patrones;
public class Patrones {
    public static void main(String[] args) {
        Caja <String> cj=new Caja<String>("juan carlos");
        System.out.println(cj.decorar());
        System.out.println(cj.obtener());
        char c=cj.obtener().charAt(2);
        System.out.println(c);
        Pareja<Integer,String> a= new Pareja<Integer,String>(20,"juanchitop@");
        System.out.println(a);
        Integer c2= a.clave()+10;
        System.out.println(c2);
        System.out.println(a.valor().charAt(6));
    }

}
