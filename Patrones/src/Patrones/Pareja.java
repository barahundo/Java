package Patrones;

public class Pareja<K,V> {
    protected K clave;
    protected V valor;
    public Pareja(K clave,V valor){
        this.clave=clave;
        this.valor=valor;
    }
    public K clave(){return clave;}
    public V valor(){return valor;}
    public String toString(){
        return "("+clave+","+valor+")";
    }
}
