/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadapplicacion;

import java.util.ArrayList;

class Profesor {
    int idProfesor;
    String nombre;
    String telefono;
    double sueldo;
    ArrayList<Seccion> secciones = new ArrayList<>();

    public Profesor(int idProfesor, String nombre, String telefono, double sueldo) {
        this.idProfesor = idProfesor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }
}
