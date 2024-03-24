package vehiculos;
import vehiculos.Pais;
import java.util.ArrayList;
public class Fabricante {

    protected String nombre;
    protected Pais pais;

    protected int cantAutos;

    protected static ArrayList<Fabricante> fabricantes = new ArrayList<>();


    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.cantAutos = 0;
        Fabricante.fabricantes.add(this);
    }

    public Fabricante() {
        this(null,null);
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public Pais getPais() {return pais;}

    public void setPais(Pais pais) {this.pais = pais;}

    public int getCantAutos() {return cantAutos;}

    public void setCantAutos(int cantAutos) {this.cantAutos = cantAutos;}

    public static Fabricante fabricaMayorVentas() {
        Fabricante Mayor = fabricantes.get(0);
        for(int i = 1; i < fabricantes.size(); i++) {
            if (Mayor.getCantAutos() < fabricantes.get(i).getCantAutos()) {
                Mayor = fabricantes.get(i);
            }
        }
        return Mayor;
    }
}
