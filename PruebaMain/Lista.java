public class Lista{
    private Nodo primero;

    public Lista(){
        primero = null;
    }
    public Lista insertarAlInicio(int entrada){
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }
    public void visualizar(){
        Nodo n;
        n = primero;
        while(n!= null){
            System.out.println(n.dato + " ");
            n = n.enlace;
        }
    }
    public void encontrarNumeroMayorYMenor(){
       Nodo numero;
       numero = primero;
       int mayor = 0;
       int menor = 500;

       while(numero!=null){
           if(numero.dato > mayor){
               mayor = numero.dato;
           }
           if(numero.dato < menor){
               menor = numero.dato;
           }
           numero = numero.enlace;
       }
       System.out.println("El numero menor es: "+menor);
       System.out.println("El numero mayor es: "+mayor);
    }
    public Nodo buscarDato(int destino){
        Nodo indice;
        int bandera=0;

        for(indice = primero; indice!=null; indice = indice.enlace){
            if(destino == indice.dato){
                return indice;
            }
            else{
                bandera=2;
            }
    }
    if(bandera==2){
        System.out.println("Numero no existe.");
    }
        return null;
            
    }
    public Nodo buscarPosicion(int posicion){
    Nodo indice;
    int i;
    int elemento;
    if (posicion < 0 )
        return null;
    indice = primero;
    for (i = 1 ;(i < posicion) && (indice != null); i++)
        indice = indice.enlace;
        elemento = indice.dato;
        System.out.println("Numero: "+elemento);
    
    return indice;
    }

    /*Nuevos Metodos: */
    public void eliminar (int entrada){
    Nodo actual, anterior;
    boolean encontrado;
    actual = primero;
    anterior = null;
    encontrado = false;
    while ((actual != null) && (!encontrado)){
        encontrado = (actual.dato == entrada);
            if (!encontrado){
                anterior = actual;
                actual = actual.enlace;
            }
    }
    if (actual != null){
        if (actual == primero){
            primero = actual.enlace;
        }
        else{
            anterior.enlace = actual.enlace;
        }
        actual = null; 
    }
    }
    public Lista insertarLista(int testigo, int entrada){
    Nodo nuevo, anterior;
    anterior = buscarDato(testigo);
    if (anterior != null){
        nuevo = new Nodo(entrada);
        nuevo.enlace = anterior.enlace;
        anterior.enlace = nuevo;
    }
    return this;
    }

    /*public ListaOrdenada insertaOrden(int entrada){
    Nodo nuevo ;
    nuevo = new Nodo(entrada);
    if (primero == null) // lista vacía
    primero = nuevo;
    else if (entrada < primero.getDato()){
        nuevo. setEnlace(primero);
        primero = nuevo;
    }
    else /* búsqueda del nodo anterior a partir del que
    se debe insertar 
    {
        Nodo anterior, p;
        anterior = p = primero;
        while ((p.getEnlace() != null) && (entrada > p.getDato())){
            anterior = p;
            p = p.getEnlace();
        }
    if (entrada > p.getDato()) //se inserta después del último nodo
        anterior = p;
// Se procede al enlace del nuevo nodo
        nuevo.setEnlace(anterior.getEnlace());
        anterior.setEnlace(nuevo);
    }
    return this;
}*/
}


