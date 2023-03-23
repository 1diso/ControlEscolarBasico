package Ejemploherencia;

import java.util.*;

import javax.swing.JOptionPane;
public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido,int edad, int codigoEstudiante, float notaFinal) 
    {	super(nombre,apellido,edad);
    	this.codigoEstudiante=codigoEstudiante;
    	this.notaFinal=notaFinal;
    	
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "Nombre:"+getNombre()+"\n Apellidos="+getApellidos()+"\n Edad: "+getEdad()+"\n Codigo Estudiante: "+codigoEstudiante+"\n Nota Final: "+notaFinal);
    }

}