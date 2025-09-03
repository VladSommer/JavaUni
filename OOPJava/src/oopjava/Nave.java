package oopjava;

// ejercicio 5
class NaveEspacial {
    String nombre;
    int conbustible;

    public NaveEspacial(String nombre, int conbustible) {
        this.nombre = nombre;
        this.conbustible = conbustible;
    }
    
    public void despegar() {
        // despegar y salir de la atmosfera
        // requiere de una gran cantidad de conbustible
        conbustible -= 20;
    }
    
    public void avanzar(int distancia) {
        if (conbustible > 0) {
            conbustible -= 10 * distancia;
        }
        else {
            System.out.println("No hay combustible");
        }
    }
    
    public void recargarCombustible(int cantidad) {
        conbustible += cantidad;
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Conbustible: " + conbustible);
    }
}

public class Nave {
    public static void main(String[] args) {
        NaveEspacial artemis_II = new NaveEspacial("Artemis II", 50);
        
        artemis_II.despegar();
        artemis_II.avanzar(2);
        artemis_II.mostrarEstado();
        artemis_II.recargarCombustible(50);
        artemis_II.mostrarEstado();
    }
}
