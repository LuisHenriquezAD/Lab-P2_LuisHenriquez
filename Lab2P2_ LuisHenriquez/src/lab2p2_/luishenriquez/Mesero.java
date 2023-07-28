
package lab2p2_.luishenriquez;


public class Mesero {
    
      private String nombre;
    private int edad;
    private String turno;
    private double sueldo;
    private double propina;

   
    public Mesero(String nombre, int edad, String turno, double sueldo, double propina) {
        this.nombre = nombre;
        this.edad = edad;
        this.turno = turno;
        this.sueldo = sueldo;
        this.propina = propina;
    }

    @Override
    public String toString() {
        return "Mesero{" + "nombre=" + nombre + ", edad=" + edad + ", turno=" + turno + ", sueldo=" + sueldo + ", propina=" + propina + '}';
    }
    
    
}
