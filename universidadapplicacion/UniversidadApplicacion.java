/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidadapplicacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniversidadApplicacion {
    static Scanner sc = new Scanner(System.in);

    static Map<Integer, Carrera> carreras = new HashMap<>();
    static Map<Integer, Curso> cursos = new HashMap<>();
    static Map<Integer, Profesor> profesores = new HashMap<>();
    static Map<Integer, Alumno> alumnos = new HashMap<>();
    static Map<Integer, Seccion> secciones = new HashMap<>();

    public static void main(String[] args) {
        
        int op;

        do {
            System.out.println("\nINFORMACION");
            System.out.println("1. Registrar Carrera");
            System.out.println("2. Registrar Curso");
            System.out.println("3. Registrar Profesor");
            System.out.println("4. Registrar Seccion");
            System.out.println("5. Registrar Alumno");
            System.out.println("6. Matricular Alumno");
            System.out.println("7. Mostrar Reporte");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();

            switch (op) {
                case 1 -> registrarCarrera();
                case 2 -> registrarCurso();
                case 3 -> registrarProfesor();
                case 4 -> registrarSeccion();
                case 5 -> registrarAlumno();
                case 6 -> matricularAlumno();
                case 7 -> mostrarReporte();
            }
        }while (op !=0);
    }
    
    static void registrarCarrera() {
        System.out.print("ID Carrera: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (carreras.containsKey(id)) {
            System.out.println("ID ya existe");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        carreras.put(id, new Carrera(id, nombre));
        
    }

    static void registrarCurso() {
    System.out.print("ID Curso: ");
    int id = sc.nextInt();
    sc.nextLine(); // limpiar

    if (cursos.containsKey(id)) {
        System.out.println("ID ya existe");
        return;
    }

    System.out.print("Nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Descripcion: ");
    String desc = sc.nextLine();

    System.out.print("Horas por semana: ");
    int horas = sc.nextInt();
    sc.nextLine(); 

    System.out.print("ID Carrera: ");
    int idCarrera = sc.nextInt();
    sc.nextLine(); 

    Carrera car = carreras.get(idCarrera);
    if (car == null) {
        System.out.println("Carrera no existe");
        return;
    }

    Curso c = new Curso(id, nombre, desc, horas);
    cursos.put(id, c);
    car.cursos.add(c);
}
    static void registrarProfesor() {
        System.out.print("ID Profesor: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (profesores.containsKey(id)) {
            System.out.println("ID ya existe");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Telefono: ");
        String tel = sc.nextLine();

        System.out.print("Sueldo: ");
        double sueldo = sc.nextDouble();

        profesores.put(id, new Profesor(id, nombre, tel, sueldo));
    }

    static void registrarSeccion() {
        System.out.print("ID Seccion: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (secciones.containsKey(id)) {
            System.out.println("ID ya existe");
            return;
        }

        System.out.print("Aula: ");
        String aula = sc.nextLine();

        System.out.print("ID Profesor: ");
        int idProf = sc.nextInt();

        Profesor prof = profesores.get(idProf);
        if (prof == null) {
            System.out.println("Profesor no existe");
            return;
        }

        System.out.print("ID Curso: ");
        int idCurso = sc.nextInt();

        Curso c = cursos.get(idCurso);
        if (c == null) {
            System.out.println("Curso no existe");
            return;
        }

        Seccion s = new Seccion(id, aula, prof);

        secciones.put(id, s);
        prof.secciones.add(s);
        c.secciones.add(s);
    }

    static void registrarAlumno() {
        System.out.print("ID Alumno: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (alumnos.containsKey(id)) {
            System.out.println("ID ya existe");
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Direccion: ");
        String dir = sc.nextLine();

        System.out.print("Telefono: ");
        String tel = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        alumnos.put(id, new Alumno(id, nombre, dir, tel, email));
    }

    static void matricularAlumno() {
        System.out.print("ID Alumno: ");
        int idAl = sc.nextInt();

        System.out.print("ID Seccion: ");
        int idSec = sc.nextInt();

        System.out.print("Nota: ");
        double nota = sc.nextDouble();

        Alumno al = alumnos.get(idAl);
        Seccion se = secciones.get(idSec);

        if (al == null || se == null) {
            System.out.println("Alumno o seccion no existe");
            return;
        }

        Matricula m = new Matricula(al, se, nota);

        se.matriculas.add(m);
        al.matriculas.add(m); 
    }

    static void mostrarReporte() {
        System.out.println("\nREPORTE");

        for (Carrera c : carreras.values()) {
            System.out.println("Carrera: " + c.nombre);

            for (Curso cu : c.cursos) {
                System.out.println("  Curso: " + cu.nombre);

                for (Seccion s : cu.secciones) {
                    System.out.println("    Seccion: " + s.idSeccion + " Aula: " + s.aula);
                    System.out.println("    Profesor: " + s.profesor.nombre);

                    for (Matricula m : s.matriculas) {
                        System.out.println("      Alumno: " + m.alumno.nombre + " Nota: " + m.nota);
                    }
                }
            }
        }
    }
}

        
  