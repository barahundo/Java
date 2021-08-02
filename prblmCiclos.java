public class prblmCiclos{
    public static void cuadrados(int i, int f){
        for(int j=i;j<=f;j++){
            System.out.println("el cuadado de "+j+" es "+(j*2));
        }
    }
    public static void im_pares(int i, int f){
            for (int j=i;j<=f;j+=2){
                System.out.println(j);
            }
    }
    public static void im_paresInv(int i){
        for (int j=i;j>=2;j-=2){
            System.out.println(j);
        }
    }
    public static int poblacion(){
        double a=25;
        double b=18.9;
        int y=2022;
        while(a>b){
            a=a*0.02+a;
            b=b*0.03+b;
            y++;
        }
        return y;
    }
    public static double ep(){
        double e=0;
        double e1=1;
        int x=-1;    
        while (e1!=e){
            e=1+Math.pow(2,x);
            x--;
            e1=1+Math.pow(2,x);
        }
        return e;
    }
    public static void main(String[] args) {
        cuadrados(1,100);
        im_pares(1,99);
        im_pares(2,100);
        im_paresInv(10);
        System.out.println("En el año "+poblacion()+" la población de A superará la d B");
        System.out.println("El menor numero q puede representar este pc es "+ep());
    }
}