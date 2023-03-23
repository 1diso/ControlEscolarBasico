package Ejemploherencia;

import java.util.*;
import javax.swing.*;
public class TiempoCompleto extends Docentes
{
private float salario;
private int Antiguedad;

public TiempoCompleto(String nombre, String apellido,int edad, String RFC, String gradoAcademico, float salario, int Antiguedad)
{
    super(nombre,apellido,edad, gradoAcademico, RFC);
    this.salario=salario;
    this.Antiguedad=Antiguedad;
}

public void mostrarDatos()
{
    JOptionPane.showMessageDialog(null, "Nombre:"+getNombre()+"\n Apellidos:"+getApellidos()+"\n Edad:"+getEdad()+"\n RFC:"+RFC+"\n Grado Academico: "+gradoAcademico+"\n Salario: "+salario+"\n Antigüedad: "+Antiguedad+" años");
}
}

