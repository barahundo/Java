package Patrones;

public class Caja {
    public String decorar( Object obj ) {
        String s = obj.toString();
        String linea = "*";
        for( int i=0; i<s.length(); i++) {
        linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }
}