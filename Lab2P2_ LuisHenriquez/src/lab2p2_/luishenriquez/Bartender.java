
package lab2p2_.luishenriquez;


public class Bartender {
    
     private String nombre;
    private int edad;
    private String turno;
    private double sueldo;
    private int licor;

    // Constructor
    public Bartender(String nombre, int edad, String turno, double sueldo, int licor) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.sueldo = sueldo;
        this.licor = licor;
    }

    @Override
    public String toString() {
        return "Bartender{" + "nombre=" + nombre + ", edad=" + edad + ", turno=" + turno + ", sueldo=" + sueldo + ", licor=" + licor + '}';
    }
    

}
