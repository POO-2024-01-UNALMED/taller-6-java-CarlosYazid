package vehiculos;

import vehiculos.Pais;
import java.util.ArrayList;

public class Fabricante {

    // Atributos de Instancia

    protected String nombre;
    protected Pais pais;
    protected int cantAutos;

    // Atributos de Clase

    protected static ArrayList<Fabricante> fabricantes = new ArrayList<>();

    // Constructores

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.cantAutos = 0;
        Fabricante.fabricantes.add(this);
    }

    public Fabricante() {this(null,null);}

    // Getters and Setters

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public Pais getPais() {return pais;}

    public void setPais(Pais pais) {this.pais = pais;}

    public int getCantAutos() {return cantAutos;}

    public void setCantAutos(int cantAutos) {this.cantAutos = cantAutos;}

    // Metodos de Clase

    public static Fabricante fabricaMayorVentas() {
        Fabricante Mayor = fabricantes.get(0);
        for(int i = 1; i < fabricantes.size(); i++) {
            if (Mayor.getCantAutos() < fabricantes.get(i).getCantAutos()) {
                Mayor = fabricantes.get(i);
            }
        }
        return Mayor;
    }
    
} // Anti - copy : Carlos Yazid Padilla