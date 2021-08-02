import java.util.Scanner;
public class PrblmCondicionales{
    public static boolean codigoVocalMin(int num){
        char c =(char) num;
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }    
    }
    public static boolean charToAscii(char c){
        int cod=(int)c;
        return (cod%2==0)? true: false;
    }
    public static boolean isDigit(char d){
        int n = Character.getNumericValue(d); 
        switch(n){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                return true;
            default:
                return false;
        }
    }
    public static void typeNumber(double num){
        if (num>0){
            System.out.println("el numero "+num+" es positivo");
        }else if(num<0){
            System.out.println("el numero "+num+" es negativo");
        }else {
            System.out.println("el numero "+num+" es neutro para la suma");
        }
        
    }
    public static void isInCircle(double x, double y,double r,double x2,double y2){
        double r2 = Math.sqrt(Math.pow((x2-x),2)+Math.pow((y2-y),2));
        if (r2>r){
            System.out.println("el punto ("+x2+","+y2+") no está dentro de la circunferencia ("+x+","+y+") con radio "+r);
        }
        System.out.println("el punto ("+x2+","+y2+") está dentro de la circunferencia ("+x+","+y+") con radio "+r);
    }
    public static String formaTriangulo (double a, double b, double c){
        return (a+b>c && b+c>a && c+a>b)?"los lados "+a+","+b+","+c+ " pueden formar un triangulo":"los lados "+a+","+b+","+c+ " no pueden formar un triangulo";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ingrese codigo: ");
        int num= sc.nextInt();
        System.out.println("el codigo "+num+" corresponde a vocal minuscula? "+codigoVocalMin(num));
        System.out.print("ingrese letra: ");
        char c=sc.next().charAt(0);
        System.out.println("el codigo de la letra "+c+" tiene un codigo par? "+charToAscii(c));
        System.out.print("ingrese 1 caracter: ");
        char c2=sc.next().charAt(0);
        System.out.println("el caracter es un numero?: "+isDigit(c2));
        System.out.print("ingrese #: ");
        double n=sc.nextDouble();
        typeNumber(n); 
        System.out.print("ingrese punto x: ");
        double x=sc.nextDouble();
        System.out.print("ingrese punto y: ");
        double y=sc.nextDouble();
        System.out.print("ingrese r: ");
        double r=sc.nextDouble();
        System.out.print("ingrese punto x2: ");
        double x2=sc.nextDouble();
        System.out.print("ingrese punto y2: ");
        double y2=sc.nextDouble();
        isInCircle(x,y,r,x2,y2); 
        System.out.println(formaTriangulo(3, 4, 5));     
        sc.close();
    }
}