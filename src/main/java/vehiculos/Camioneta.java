package vehiculos;
import vehiculos.Vehiculo;
import vehiculos.Fabricante;
public class Camioneta extends Vehiculo{

    protected boolean volco;
    protected static int cantidadCamioneta;

    public Camioneta(String placa, int puertas, String nombre, int precio, float peso,Fabricante fabricante,boolean volco) {
        super(placa,puertas, 90,nombre,precio,peso,"4X4",fabricante);
        this.volco = volco;
        Camioneta.cantidadCamioneta++;
    }

    public Camioneta() {
        this(null,0,null,0,0,null,false);
    }



}
