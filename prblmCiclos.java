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
    //factorial recursivo
    public static int factorial(int x){
        if (x==1){
            return 1;
        }else{
            return x* factorial(x-1);
        }
    }
    //factorial recursivo ternario
    public static int factorial2(int x){
        return (x==1)?1:x*factorial2(x-1);
    }
    public static int potencia2(int n){
        int p=2;
        for(int i=1;i<n;i++){
            p*=2;
        }
        return p;
    }
    public static double potenciaXaN(double x, int n){
        double r=x;
        for(int i=1; i<n; i++){
            r*=x;
        }
        return r;
    }
    public static void tablasMultiplicar(){
        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        cuadrados(1,100);
        im_pares(1,99);
        im_pares(2,100);
        im_paresInv(10);
        System.out.println("En el año "+poblacion()+" la población de A superará la d B");
        System.out.println("El menor numero q puede representar este pc es "+ep());
        for (int i=1;i<=10;i++){
            System.out.println(i+"! "+factorial(i));
        }
        System.out.println("potencia de 2 elevado a: "+5+" = "+potencia2(5));
        System.out.println("potencia de "+8+" a la "+2+" = "+potenciaXaN(2,5));
        tablasMultiplicar();
    }
}