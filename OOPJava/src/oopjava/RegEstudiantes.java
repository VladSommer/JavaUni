package oopjava;

// ejercicio 1
class Estudiante {
    public String nombre;
    public String apellido;
    public String curso;
    public int calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion Actual: " + calificacion);
    }
    
    public void bajarCalificacion(int puntos) {
        calificacion -= puntos;
    }
    public void subirCalificacion(int puntos) {
        calificacion += puntos;
    }
}

public class RegEstudiantes {
    public static void main(String[] args) {
        Estudiante vlad = new Estudiante(
                "Vlad",
                "Sommer", 
                "Programacion II",
                7
        );
        vlad.subirCalificacion(2);
        vlad.bajarCalificacion(3);
        vlad.mostrarInfo();
    }
    
}
