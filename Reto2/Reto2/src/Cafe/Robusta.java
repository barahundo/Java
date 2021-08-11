package Cafe;

public class Robusta extends Cafe{
    public float cant;
    protected String tipo="Robusta";
    /**
     * Construyendo el objeto <Cafe>Robusta
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
     * retornando una cadena con los atributos del objeto <Cafe>Robusta
     * @return
     */
    @Override
    public String toString() {
        String imp="\t>Cafe "+tipo+"\n"+"\tConsecutivo: "+id+"\n"+"\tPrecio: $"+precio+"\n";
        String expr=(molido)?"\tPresentacion: Molido\n":"\tPresentacion: Grano\n";
        imp+=expr+"\tCantidad: "+cant;
        return imp;
    }  
    
}
