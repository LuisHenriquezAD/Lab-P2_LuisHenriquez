
package lab2p2_.luishenriquez;

public class Mesa {
    
     private int numPlatos;
    private int numUtensilios;
    private double precioTotal;
    
    public Mesa(int numPlatos, int numUtensilios, double precioTotal) {
        this.numPlatos = numPlatos;
        this.numUtensilios = numUtensilios;
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numPlatos=" + numPlatos + ", numUtensilios=" + numUtensilios + ", precioTotal=" + precioTotal + '}';
    }
    
    
    
}
