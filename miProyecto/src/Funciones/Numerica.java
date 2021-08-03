package Funciones;

/**
 * imprime numeros de un punto inc a uno final con los
 * respectivos cuadrados
 * @param a inicial
 * @param b final
 */
public class Numerica {
    public static void impCuadrados(int a,int b){
        int f=b;
        for(int i=a;i<=f;i++){
            System.out.println(i+"\t"+i*i);
        }
        System.out.println();
    }
    /**
     * imprime numeros de 2 en 2 iniciando en pares o impares
     * @param in
     * @param f
     */
    public static void im_pares(int in,int f){
        for(int i=in;i<=f;i+=2){
            System.out.println(i);
        }
        System.out.println();
    }
    public static void descendente(int in){
        for(int i=in%2==0?in:in-1;i>=2;i-=2){
            System.out.println(i);
        }
        System.out.println();
    }
}
