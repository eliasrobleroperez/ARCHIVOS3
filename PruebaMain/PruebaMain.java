import java.util.*;
import java.util.Scanner;

public class PruebaMain{
    public static void main(String[] args){
        PruebaMain prueba = new PruebaMain();
        prueba.unionConjuntos();

    }
        public void unionConjuntos(){
        Scanner teclado = new Scanner(System.in);
        Lista lista1 = new Lista();
        Lista lista2 = new Lista();

        int capacidad = 0;
        int numero = 0;
        int numero2 = 0;
        int capacidad2 = 0;
        int numerosIguales = 0;

        System.out.print("1.-Ingrese la cantidad de nodos que tendra su lista primer lista: ");
        capacidad =  teclado.nextInt();

        System.out.println("\nA continuacion ingrese los numeros:  ");
        for(int i=0; i<capacidad;i++){
            System.out.print("-Ingrese un numero: ");
            numero = teclado.nextInt();
            lista1.insertarAlInicio(numero);
        }

        System.out.print("\n1.-Ingrese la cantidad de nodos que tendra su lista segunda lista: ");
        capacidad2 =  teclado.nextInt();

        System.out.println("\nA continuacion ingrese los numeros: ");
        for(int i=0; i<capacidad2;i++){
            System.out.print("-Ingrese un numero: ");
            numero2 = teclado.nextInt();
            lista1.insertarAlInicio(numero2);
        }
        System.out.println("La Union de las 2 listas son: ");
        lista1.visualizar();
        lista2.visualizar();

        int numerosIguales2 = 0;
        int totalIguales = 0;


        if(numero == numero){
            numerosIguales = numero;
            lista1.eliminar(numero);
            lista1.eliminar(numerosIguales);

        }
        if(numero2 == numero2){
            numerosIguales2 = numero2;
            lista1.eliminar(numero2);
        }
        if(numerosIguales == numerosIguales2){
            totalIguales =  numerosIguales;
            lista1.insertarAlInicio(totalIguales);
            lista1.insertarAlInicio(numerosIguales);
        }

        System.out.println("La interseccion es: ");
        lista1.visualizar();


    }
    
        

}

    

