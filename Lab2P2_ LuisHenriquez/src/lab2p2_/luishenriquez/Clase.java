package lab2p2_.luishenriquez;

public class Clase {

    private String nombrechef;
    private int edad;
    private String turno;
    private int michelin;
    private double sueldo;

    public String getNombrechef() {
        return nombrechef;
    }

    public int getEdad() {
        return edad;
    }

    public String getTurno() {
        return turno;
    }

    public int getMichelin() {
        return michelin;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setNombrechef(String nombrechef) {
        this.nombrechef = nombrechef;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setMichelin(int michelin) {
        this.michelin = michelin;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Clase(String nombrechef, int edad, String turno, int michelin, double sueldo) {
        this.nombrechef = nombrechef;
        this.edad = edad;
        this.turno = turno;
        this.michelin = michelin;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Chefs{" + "Nombre chef = " + nombrechef + ", Edad = " + edad + ", Turno = " + turno + ", Estrellas Michelin = " + michelin + ", Sueldo = " + sueldo + '}';
    }

}
