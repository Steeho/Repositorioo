/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadapplicacion;

class Matricula {
    Alumno alumno;
    Seccion seccion;
    double nota;

    public Matricula(Alumno alumno, Seccion seccion, double nota) {
        this.alumno = alumno;
        this.seccion = seccion;
        this.nota = nota;
    }
}
