package Cafe;

public class Arabigo extends Cafe {
    public String origen;
    public String color;
    protected String tipo="Arabigo";
    /**
     * Construyendo el objeto <Cafe>Arabigo
     * @param id
     * @param precio
     * @param molido
     * @param origen
     * @param color
     */
    public Arabigo (int id,float precio,boolean molido,String origen,String color){
        super(id, precio, molido);
        this.origen=origen;
        this.color=color;
    }
    /**
     * retornando una cadena con los atributos del objeto <Cafe>Arabigo
     * @return
     */
    @Override
    public String toString() {
       String imp="\t>Cafe "+tipo+"\n"+"\tConsecutivo: "+id+"\n"+"\tPrecio: $"+precio+"\n";
       String expr=(molido)?"\tPresentacion: Molido\n":"\tPresentacion: Grano\n";
       imp+=expr+"\tOrigen: "+origen+"\n"+"\tEmpaque: "+color;
       return imp;
    }      
}
