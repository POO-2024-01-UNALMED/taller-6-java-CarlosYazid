package vehiculos;

import vehiculos.Vehiculo;
import vehiculos.Fabricante;

public class Camion extends Vehiculo {

    // Atributos de Instancia

    protected int ejes;

    // Atributos de Clase

    protected static int cantidadCamiones;

    // Constructores

    public Camion (String placa, String nombre, int precio, float peso, Fabricante fabricante,int ejes) {
        super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
        this.ejes = ejes;
        Camion.cantidadCamiones++;
    }

    public Camion() {this(null,null,0,0,null,0);}

    // Getters and Setters

    public static int getCantidadCamiones(){return Camion.cantidadCamiones;}

}// Anti - copy : Carlos Yazid Padilla