package vehiculos;

import java.util.ArrayList;

public class Pais {

    // Atributos de Instancia

    protected String nombre;
    protected ArrayList<Vehiculo> listAutos;

    // Atributos de Clase

    protected static ArrayList<Pais> listPaises = new ArrayList<>();

    // Constructores

    public Pais(String nombre) {
        this.nombre = nombre;
        this.listAutos = new ArrayList<>();
        Pais.listPaises.add(this);
    }

    public Pais() {this(null);}

    // Getters and Setters

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public ArrayList<Vehiculo> getListAutos() {return listAutos;}

    public int getCantAutos(){return listAutos.size();}

    // Metodos de Clase

    public static Pais paisMasVendedor() {
        Pais Mayor = listPaises.get(0);
        for(int i = 0; i < listPaises.size(); i++) {
            if (Mayor.getCantAutos() < listPaises.get(i).getCantAutos()) {
                Mayor = listPaises.get(i);
            }
        }
        return Mayor;
    }
    
} // Anti - copy: Carlos Yazid Padilla