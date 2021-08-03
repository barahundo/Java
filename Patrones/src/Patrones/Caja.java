package Patrones;
/**
 * Convirtiendo la caja en generica
 */
public class Caja <T>{//operador diamante <>: generalizar manteniendo tipo d datos sus atributos y metodos
    protected T obj;
    public Caja(T obj){ this.obj=obj;}
    public T obtener(){return obj;}
    public String decorar() {
        String s = obj.toString();
        String linea = "*";
        for( int i=0; i<s.length(); i++) {
        linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
}