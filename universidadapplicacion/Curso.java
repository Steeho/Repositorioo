/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadapplicacion;

import java.util.ArrayList;

class Curso {
    int idCurso;
    String nombre;
    String descripcion;
    int horasPorSemana;
    ArrayList<Seccion> secciones = new ArrayList<>();

    public Curso(int idCurso, String nombre, String descripcion, int horas) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horasPorSemana = horas;
    }
}