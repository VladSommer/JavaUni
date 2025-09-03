package oopjava;

// ejercicio 4
class Gallina {
    int id;
    int edad;
    int huevosPuestos;
    
    public Gallina(int id, int edad, int huevosPuestos) {
        this.id = id;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo() {
        huevosPuestos += 1;
    }
    
    public void envejecer() {
        edad += 1;
    }
    
    public void mostrarEstado() {
        System.out.println("ID: " + id);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Huevos Puestos: " + huevosPuestos);
    }
}

public class GestionGallinas {
    
    public static void main(String[] args) {
        Gallina gallina_1 = new Gallina(1, 3, 40);
        Gallina gallina_2 = new Gallina(2, 1, 34);
        
        gallina_1.mostrarEstado();
        gallina_1.ponerHuevo();
        gallina_1.envejecer();
        
        System.out.println("\n");
        
        gallina_2.mostrarEstado();
        gallina_2.ponerHuevo();
        gallina_2.envejecer();
        
        System.out.println("=====================");
        
        gallina_1.mostrarEstado();
        System.out.println("\n");
        gallina_2.mostrarEstado();
    }
    
}
