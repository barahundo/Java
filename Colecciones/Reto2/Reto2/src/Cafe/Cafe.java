package Cafe;

public abstract class Cafe {
    protected int id;
    protected float precio;
    protected boolean molido;
    public Cafe(int id,float precio,boolean molido){
        this.id=id;
        this.precio=precio;
        this.molido=molido;
    }
    public abstract void impObj();
}
