public class Nodo{
    int dato;
    Nodo enlace;

    public Nodo(int x){
        dato = x;
        enlace = null;
    }
    public Nodo(int x, Nodo referencia){
        dato = x;
        enlace = referencia;
    }
    public Nodo getEnlace(){
        return enlace;
    }
    public int getDato(){
        return dato;
    }
    public void setEnlace(Nodo referencia){
        this.enlace = referencia;
    }
}