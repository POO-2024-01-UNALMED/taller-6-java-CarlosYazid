package vehiculos;
import vehiculos.Vehiculo;
import vehiculos.Fabricante;
public class Automovil extends Vehiculo {

    protected int puestos;
    protected static int cantidadAutomoviles;

    public Automovil(String placa, String nombre, int precio, float peso, Fabricante fabricante, int puestos) {
        super(placa, 4,100,nombre,precio,peso,"FWD",fabricante);
        this.puestos = puestos;
        Automovil.cantidadAutomoviles++;
    }

    public Automovil() {
        this(null,null,0,0,null,0);
    }



}
