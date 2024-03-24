package vehiculos;
import vehiculos.Vehiculo;
import vehiculos.Fabricante;
public class Camion extends Vehiculo {

    protected int ejes;

    protected static int cantidadCamiones;

    public Camion (String placa, String nombre, int precio, float peso, Fabricante fabricante,int ejes) {
        super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
        this.ejes = ejes;
        Camion.cantidadCamiones++;
    }

    public Camion() {
        this(null,null,0,0,null,0);
    }


}
