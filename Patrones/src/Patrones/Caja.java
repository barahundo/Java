package Patrones;

public class Caja {
    protected Object obj;
    public Caja(Object obj){ this.obj=obj;}
    public Object obtener(){return obj;}
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