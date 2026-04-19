/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadapplicacion;

import java.util.ArrayList;

class Alumno {
    int idAlumno;
    String nombre;
    String direccion;
    String telefono;
    String email;
    ArrayList<Matricula> matriculas = new ArrayList<>(); // 🔥 mejora

    public Alumno(int idAlumno, String nombre, String direccion, String telefono, String email) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
}
