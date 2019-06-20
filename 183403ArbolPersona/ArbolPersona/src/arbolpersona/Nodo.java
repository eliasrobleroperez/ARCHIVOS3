package arbolpersona;


public class Nodo{
    private Persona dato;
    private Nodo izquierdo;
    private Nodo derecho;

    public Nodo (){}


    public void Nodo (Persona dato){
        this.dato = dato;
    }

    public Nodo getDerecho(){
        return derecho;
    }

    public Nodo getIzquierdo(){ 
        return izquierdo;
    }

    public Persona getDato(){
        return dato;
    }

    public void setDato(Persona dato){
        this.dato = dato;
    }

    public void setIzquierdo(Nodo nodo){
        izquierdo = nodo;
    }

    public void setDerecho(Nodo nodo){
        derecho = nodo;
    }

    public void visitar() {
        System.out.print(dato + " "); 
       }
}