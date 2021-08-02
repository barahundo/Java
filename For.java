import java.util.Scanner;
public class For{
    // sumatoria atraves de la recursión!!
    public static int sumatoria(int i){
        if(i==1){
            return 1;
        }else{
            return i+sumatoria(i-1);
        }
    }
    //sumatoria con for
    public static int sumatoria2(int x){
        int sum=0;
        for(int i=0;i<=x;i++){
            sum+=i;
        }
        return sum;
    }
    //sumatoria con formula
    public static int sum(int x){
        return (x*(x-1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumatoria(5));
        System.out.print("ingrese # para sumatoria: ");
        int x=sc.nextInt();
        System.out.println("la sumatoria de los primeros "+x+" numeros es "+sumatoria2(x));
        for(int i=0, j=10;i<=10;i++,j--){
            System.out.println(i+" "+j);
        }
        String[] frutas= new String[]{"Tomate de arbol","maracuyeah!","güyaba","Güayabana"};
        for(String elem:frutas){
            System.out.println(elem);
        }
        String[] carros= new String[]{"audy","folsfajen","renolt","que masda","tollota","mercho"};
        for (String elm: carros){
            if(elm=="tollota"){
                System.out.println(elm);
            }
        }
        sc.close();
    }
}