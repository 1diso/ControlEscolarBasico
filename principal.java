package Ejemploherencia;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
        int respuesta = 0, r = 0, codigo = 0, edad = 0;
        String apellido = "", RFC = "", nombre = "", gradoa = "";

        // Arreglo de objetos
        Persona personas[] = new Persona[2];
        int i = 0;

        do {
            respuesta = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Leer \n 2.-Imprimir \n 3.-Buscar por nombre \n 4.-Salir \n elegir opcion"));

            switch (respuesta) {
                case 1:
                    if (i >= personas.length) {
                        JOptionPane.showMessageDialog(null, "No puede ingresar más datos, el arreglo está lleno.");
                        break;
                    }

                    nombre = JOptionPane.showInputDialog(null, "Introduce el nombre");
                    apellido = JOptionPane.showInputDialog(null, "Introduce el apellido");
                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la edad"));
                    r = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Estudiante \n 2.-Profesor \n elegir opcion"));

                    if (r == 1) {
                        codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el codigo del estudiante"));
                        int notaf = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la nota final"));
                        Estudiante alumno = new Estudiante(nombre, apellido, edad, codigo, notaf);
                        personas[i] = alumno;
                    } else {
                        RFC = JOptionPane.showInputDialog(null, "Introduce el RFC");
                        gradoa = JOptionPane.showInputDialog(null, "Introduce el grado Academico");
                    
                        int opcionDocente = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Trabaja jornada completa \n 2.- Trabaja por horas \n elegir opcion"));
                    
                        if (opcionDocente == 1)
                         {
                            float salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el salario"));
                            int antiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la antigüedad"));
                            Docentes profesor = new TiempoCompleto(nombre, apellido, edad, RFC, gradoa, salario, antiguedad);
                            personas[i] = profesor;
                         } 
                        else if (opcionDocente == 2)
                         {
                            int numerodeHoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de horas trabajadas"));
                            int pagoporHora = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el pago por hora"));
                            Docentes profesor = new PorHoras(nombre, apellido, edad, RFC, gradoa, numerodeHoras, pagoporHora);
                            personas[i] = profesor;
                         } 
                    }
                    i++;
                    break;

                case 2:
                    for (int j = 0; j < i; j++) {
                        personas[j].mostrarDatos();
                    }
                    break;

                case 3:
                    String nombreBuscado = JOptionPane.showInputDialog(null, "Introduce el nombre a buscar");
                    boolean encontrado = false;

                    for (int j = 0; j < i; j++) {
                       // if (personas[j].getNombre().equalsIgnoreCase(nombreBuscado)) {
                            if (personas[j].getNombre().toLowerCase().equals(nombreBuscado.toLowerCase())) {
                            encontrado = true;
                            break;
                        }
                    }

                    if (encontrado) {
                        JOptionPane.showMessageDialog(null, "Nombre encontrado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Nombre no encontrado.");
                    }
                    break;
            }
        } while (respuesta != 4);
	
	} 
}
