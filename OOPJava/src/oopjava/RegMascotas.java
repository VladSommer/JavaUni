package oopjava;

// ejercicio 2
class Mascota {
    public String nombre;
    public String raza;
    public int edad;
    
    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("edad: " + edad + " anios");
    } 
    
    public void cumplirAnios() {
        edad += 1;
    }
    
}

public class RegMascotas {
    public static void main(String[] args) {
        Mascota zarina = new Mascota(
                "Zarina",
                "Perro crestado rodesiano",
                4
        );
        
        zarina.mostrarInfo();
        zarina.cumplirAnios();
        System.out.println("\n");
        zarina.mostrarInfo();

        
    }
}
