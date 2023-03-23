package Ejemploherencia;

import java.util.*;

import javax.swing.JOptionPane;
public class Docentes extends Persona 
{
    protected String RFC;
    protected String gradoAcademico;
    
    public Docentes(String nombre, String apellido,int edad, String RFC, String gradoAcademico) 
    {	super(nombre,apellido,edad);
    	this.RFC=RFC;
    	this.gradoAcademico=gradoAcademico;
    }

   
    public void mostrarDatos() 
    {
    	JOptionPane.showMessageDialog(null, "Nombre:"+getNombre()+"\n Apellidos:"+getApellidos()+"\n Edad:"+getEdad()+"\n RFC:"+RFC+"\n Grado Academico:"+gradoAcademico);
        
    }

}