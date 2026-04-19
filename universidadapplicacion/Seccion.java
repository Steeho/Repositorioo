/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadapplicacion;

import java.util.ArrayList;

class Seccion {
    int idSeccion;
    String aula;
    Profesor profesor;
    ArrayList<Matricula> matriculas = new ArrayList<>();

    public Seccion(int idSeccion, String aula, Profesor profesor) {
        this.idSeccion = idSeccion;
        this.aula = aula;
        this.profesor = profesor;
    }
}