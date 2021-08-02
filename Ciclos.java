public class Ciclos{
    public static double minNum(){
        double x=1.0;
        double x1=x/2.0;
        while(x1>0){
            x=x1;
            x1=x/2.0;
        }
        return x;
    }
    public static void main(String[] args) {
       /* int i=0;
        while (i<10){
            System.out.println(i);
            i++;
        }
        int i =2;
        int j=25;
        while (i<j){
            System.out.println(i+" , "+j);
            i*=2;
            j+=10;
        }
        System.out.println("the end");
        System.out.println(i+" , "+j);*/
        System.out.println(minNum());
        //nada
    }
}