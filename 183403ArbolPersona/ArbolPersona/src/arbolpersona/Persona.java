package arbolpersona;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Persona {
	private String nombre;
	private String apellido;
	private int folio;
	
	private int edad;
        
        public Persona(){}
	
	public Persona(String nombre, String apellido, int edad,int folio) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.folio = folio;
	}
	
	public static String leerArchivo(String dato) throws FileNotFoundException, IOException {


        String contenedor;
        FileReader archivo = new FileReader(dato);
        BufferedReader b = new BufferedReader(archivo);

        contenedor = b.readLine();
        b.close(); 
        return contenedor;

    
    }

	public String resultado() {
		return nombre+", " + apellido + ", " + edad + " ";
	}

	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}
	


}
