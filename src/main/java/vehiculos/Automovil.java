package vehiculos;
import vehiculos.Vehiculo;
import vehiculos.Fabricante;
public class Automovil extends Vehiculo {

    // Atributos de Instancia

    protected int puestos;

    // Atributos de Clase

    protected static int cantidadAutomoviles;

    // Constructores

    public Automovil(String placa, String nombre, int precio, float peso, Fabricante fabricante, int puestos) {
        super(placa, 4,100,nombre,precio,peso,"FWD",fabricante);
        this.puestos = puestos;
        Automovil.cantidadAutomoviles++;
    }

    public Automovil() {this(null,null,0,0,null,0);}

    // Getters and Setters

    public static int getCantidadAutomoviles(){return Automovil.cantidadAutomoviles;}

}// Anti - copy : Carlos Yazid Padilla