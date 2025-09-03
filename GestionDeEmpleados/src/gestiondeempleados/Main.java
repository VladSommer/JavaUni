package gestiondeempleados;

class Empleado {
    public int id;
    public String nombre;
    public String puesto;
    public double salario;
    static int totalEpleados;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEpleados++;
    }
    
    public Empleado(String nombre, String puesto) {
        this.id = totalEpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 190;
        totalEpleados++;
    }
    
    public void actualizarSalario(int porcentaje) {
        double p = salario * (porcentaje / 100);
        salario += p;
        
    }
    // si no se especifica, el porcentaje default podria ser de un 10%
    public void actualizarSalario() {
        double p = salario * 0.10;
        salario += p;
    }

    @Override
    public String toString() {
        return "Empleado N " + id + 
                "\nNombre: " + nombre +
                "\nPuesto: " + puesto +
                "\nSalario: " + salario + " USD";
    }
    static void mostrarTotalEmpleados() {
        System.out.println(totalEpleados + " Empleados registrados en total");
    }
}
public class Main {

    public static void main(String[] args) {
        // los nombres se sacaron del equipo de desarrollo
        // de un juego llamado "ULTRAKILL" (los saldos son ficticios)
        Empleado emp1 = new Empleado(1, "Arsi \"Hakita\" Patala", "Programador y compositor", 300);
        Empleado emp2 = new Empleado(2, "\"Pitr\"", "Programador y optimizador", 267);
        Empleado emp3 = new Empleado("Victoria Holland", "Artista 3d y programadora de Shaders");
        Empleado emp4 = new Empleado("Francis Xie", "Artista conceptual y de texturas");
        
        emp1.actualizarSalario();
        emp2.actualizarSalario(15);
        emp3.actualizarSalario();
        emp4.actualizarSalario(13);
        
        System.out.println(emp1.toString());
        System.out.println("================================");
        System.out.println(emp2.toString());
        System.out.println("================================");
        System.out.println(emp3.toString());
        System.out.println("================================");
        System.out.println(emp4.toString());
        System.out.println("================================");        
        Empleado.mostrarTotalEmpleados();   
    }
}
