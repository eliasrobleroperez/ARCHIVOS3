/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolpersona;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author carlos
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label mayor;

    @FXML
    private Label menor;
    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtNombre;
    @FXML
    private Label txnombreMa;

    @FXML
    private Label txnombreMe;

    @FXML
    private Label txApellidoMa;

    @FXML
    private Label txApellidoMe;

    @FXML
    private TextField txtApellido;
    Persona persona;
    Nodo raiz;
    Nodo mayor1 = new Nodo();
    Nodo menor1 = new Nodo();

    boolean primero = true;

    @FXML
    void agregar(ActionEvent event) {
        if (primero) {
            persona = new Persona();
            persona.setFolio(Integer.parseInt(txtMatricula.getText()));
            persona.setNombre(txtNombre.getText());
            persona.setApellido(txtApellido.getText());
            System.out.println("hola");
            raiz = new Nodo();
            raiz.setDato(persona);
            primero = false;
        } else {
            persona = new Persona();
            persona.setFolio(Integer.parseInt(txtMatricula.getText()));
            persona.setNombre(txtNombre.getText());
            persona.setApellido(txtApellido.getText());
            System.out.println("hola");
            buscar(raiz, persona);
        }

    }

    @FXML
    void mayorMenor(ActionEvent event) {
        Nodo may = mayor(raiz);
        Nodo men = menor(raiz);
        if (may != null && men != null) {
            mayor.setText(String.valueOf(may.getDato().getFolio()));
            menor.setText(String.valueOf(men.getDato().getFolio()));
            txApellidoMa.setText(may.getDato().getApellido());
            txApellidoMe.setText(men.getDato().getApellido());
            txnombreMa.setText(may.getDato().getNombre());
            txnombreMe.setText(men.getDato().getNombre());
        }else{
            System.out.println("no se encontro el dato");
        }   
    }

    public Nodo mayor(Nodo raiz) {
        if (raiz.getDerecho() != null) {
            mayor(raiz.getDerecho());
        } else {
            mayor1 = raiz;
        }
        return mayor1;
    }

    public Nodo menor(Nodo raiz) {
        if (raiz.getIzquierdo() != null) {
            menor(raiz.getIzquierdo());
        } else {
            menor1 = raiz;
        }
        return menor1;
    }

    public static void buscar(Nodo raiz, Persona per) {
        int valor = per.getFolio();
        if (valor > raiz.getDato().getFolio()) {
            if (raiz.getDerecho() != null) {
                buscar(raiz.getDerecho(), per);
            } else {
                Nodo der = new Nodo();
                der.setDato(per);
                raiz.setDerecho(der);
                System.out.println("dato agregado");
            }

        } else if (valor < raiz.getDato().getFolio()) {
            if (raiz.getIzquierdo() != null) {
                buscar(raiz.getIzquierdo(), per);
            } else {
                Nodo izq = new Nodo();
                izq.setDato(per);
                raiz.setIzquierdo(izq);
                System.out.println("dato agregado");
            }
        } else if (valor == raiz.getDato().getFolio()) {
            System.out.println("no se permiten datos iguales");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
