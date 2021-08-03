package Patrones;
public class Patrones {
    public static void main(String[] args) {
        Caja cj=new Caja();
        String s=cj.decorar(10);
        System.out.println(s);
        String s2=cj.decorar(-25.36);
        System.out.println(s2);
        String s3=cj.decorar("juan carlos");
        System.out.println(s3);
    }

}
