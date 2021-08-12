package Cafe;

public class Arabigo extends Cafe {
    protected String origen;
    protected String color;
    protected String tipo="Arabigo";
    /**
     * Construyendo obj <Cafe> arabigo
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
     * reescribiendo el metodo toString para 
     * imprimir los atributos del objeto <Cafe> arabigo
     * @return
     */
    @Override
    public String toString() {
        String linea="\t>Cafe "+tipo+"\n"+"\tConsecutivo: "+id+"\n"+"\tPrecio: $"+precio+"\n";
        String expr=(molido)?"\tPresentacion: Molido\n":"\tPresentacion: Grano\n";
        linea+=expr+"\tOrigen: "+origen+"\n"+"\tEmpaque: "+color;
        return linea;
    }    
}
