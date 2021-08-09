package Cafe;

public class Robusta extends Cafe{
    public float cant;
    protected String tipo="Robusta";
    public Robusta (int id,float precio,boolean molido,float cant,String tipo){
        super(id, precio, molido);
        this.cant=cant;
        this.tipo=tipo;
    }
    @Override
    public void impObj() {
       System.out.println("\t>Cafe "+this.tipo);
       System.out.println("\tConsecutivo: "+this.id);
       System.out.println("\tPrecio: $"+this.precio);
       String expr=(this.molido)?"\tPresentacion: Molido":"\tPresentacion: Grano";
       System.out.println(expr);
       System.out.println("\tCantidad: "+this.cant+ "kg");
    }  
    
}
