package Cafe;

public class Arabigo extends Cafe {
    public String origen;
    public String color;
    protected String tipo="Arabigo";
    public Arabigo (int id,float precio,boolean molido,String origen,String color){
        super(id, precio, molido);
        this.origen=origen;
        this.color=color;
    }
    @Override
    public void impObj() {
       System.out.println("\t>Cafe "+this.tipo);
       System.out.println("\tConsecutivo: "+this.id);
       System.out.println("\tPrecio: $"+this.precio);
       String expr=(this.molido)?"\tPresentacion: Molido":"\tPresentacion: Grano";
       System.out.println(expr);
       System.out.println("\tOrigen: "+this.origen);
       System.out.println("\tEmpaque: $"+this.color);
    }  
    
}
