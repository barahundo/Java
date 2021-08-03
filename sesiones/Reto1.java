import java.util.Scanner;
public class Reto1{
    public static void simVirus(int iip){
        int iih=(iip*2)+4;
        int iiv=((iih)+iip)/5;
        System.out.println(iip+" "+iih+" "+iiv);
        if (iiv>0 && iiv<20){
            System.out.println("uno");
        }else if(iiv>21 && iiv<30){
            System.out.println("dos");
        }else if (iiv>31 && iiv<50){
            System.out.println("tres");
        }else{
            System.out.println("cuatro");
        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int iip=sc.nextInt();
        simVirus(iip);
        sc.close();
        //probando git
    }
}