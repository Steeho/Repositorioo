/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadapplicacion;

import java.util.ArrayList;

class Carrera {
    int idCarrera;
    String nombre;
    ArrayList<Curso> cursos = new ArrayList<>();

    public Carrera(int idCarrera, String nombre) {
        this.idCarrera = idCarrera;
        this.nombre = nombre;
    }
}


    

