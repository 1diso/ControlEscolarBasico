package Ejemploherencia;

import java.util.*;
import javax.swing.*;
public class PorHoras extends Docentes
{
private int numerodeHoras;
private int pagoporHora;

public PorHoras(String nombre, String apellido,int edad, String RFC, String gradoAcademico, int numerodeHoras, int pagoporHora)
{
    super(nombre,apellido,edad,RFC,gradoAcademico);
    this.numerodeHoras=numerodeHoras;
    this.pagoporHora=pagoporHora;
}

public void mostrarDatos()
{
    JOptionPane.showMessageDialog(null, "Nombre:"+getNombre()+"\n Apellidos:"+getApellidos()+"\n Edad:"+getEdad()+"\n RFC: "+RFC+"\n Grado Academico: "+gradoAcademico+"\n Numero de Horas: "+numerodeHoras+"\n Pago por Hora: "+pagoporHora);
}
}
