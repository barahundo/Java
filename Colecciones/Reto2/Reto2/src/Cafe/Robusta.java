package Cafe;

public class Robusta extends Cafe{
    public float cant;
    protected String tipo="Robusta";
    /**
     * Construyendo obj <Cafe> robusta
     * @param id
     * @param precio
     * @param molido
     * @param cant
     * @param tipo
     */
    public Robusta (int id,float precio,boolean molido,float cant,String tipo){
        super(id, precio, molido);
        this.cant=cant;
        this.tipo=tipo;
    }
    /**
     * reescribiendo el metodo toString para 
     * imprimir los atributos del objeto <Cafe> robusta
     * @return
     */
    @Override
    public String toString() {
        String linea="\t>Cafe "+tipo+"\n"+"\tConsecutivo: "+id+"\n"+"\tPrecio: $"+precio+"\n";
        String expr=(molido)?"\tPresentacion: Molido\n":"\tPresentacion: Grano\n";
        linea+=expr+"\tCantidad: "+cant+" kg";
        return linea;
    }  
    
}
