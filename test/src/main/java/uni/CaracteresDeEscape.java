package uni;

public class CaracteresDeEscape {
    public static void main(String[] args) {
        String nombre = "Nombre: Juan Perez";
        String edad = "Edad: 30 años";
        String direccion = "Direccion: \"Calle Falsa 123\"";
        
        System.out.println(
                nombre + "\n" +
                edad + "\n" + 
                direccion + "\n"
        );
    }
}
