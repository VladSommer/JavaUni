package oopjava;

// ejercicio 3

class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int ap) {
        anioPublicacion = ap;
    }
    
}

public class EncapsulamientoLibro {
    public static void main(String[] args) {
        Libro juego_de_tronos = new Libro(
                "Cancion de hielo y fuego: Juego de Tronos",
                "George R.R. Martin",
                2000
        );
        
        juego_de_tronos.setAnioPublicacion(1996);
        
        System.out.println("Titulo: " + juego_de_tronos.getTitulo());
        System.out.println("Autor: " + juego_de_tronos.getAutor());
        System.out.println("Publicacion: " + juego_de_tronos.getAnioPublicacion());
        
    }
}
