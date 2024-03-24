package vehiculos;

import vehiculos.Fabricante;

public class Vehiculo {

    /*
    *  Taller 6 Java
    *  Realizado el 23 de marzo del 2024
    *  Desarrollado por Carlos Yazid Padilla
    *  Topico: Herencia 2
    *
    *  Dependencias:
    *
    *  - vehiculos > Vehiculo
    *  - vehiculos > Pais
    *  - vehiculos > Fabricante
    *  - vehiculos > Camion
    *  - vehiculos > Camioneta
    *  - zooAnimales > Automovil
    *
    */


    // Atributos de Instancia

    protected String placa;
    protected int puertas;
    protected int velocidadMaxima;
    protected String nombre;
    protected int precio;
    protected float peso;
    protected String traccion;
    protected Fabricante fabricante;

    // Atributos de Clase
    protected static int CantidadVehiculos;

    // Constructores

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, float peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        this.fabricante.setCantAutos(this.fabricante.getCantAutos() + 1);
        this.fabricante.getPais().getListAutos().add(this);
        Vehiculo.CantidadVehiculos++;
    }

    public Vehiculo() {
        this(null,0,0,null,0,0,null,null);
    }

    // Getters and Setters


    public String getPlaca() {return placa;}

    public void setPlaca(String placa) {this.placa = placa;}

    public int getPuertas() {return puertas;}

    public void setPuertas(int puertas) {this.puertas = puertas;}

    public int getVelocidadMaxima() {return velocidadMaxima;}

    public void setVelocidadMaxima(int velocidadMaxima) {this.velocidadMaxima = velocidadMaxima;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getPrecio() {return precio;}

    public void setPrecio(int precio) {this.precio = precio;}

    public float getPeso() {return peso;}

    public void setPeso(float peso) {this.peso = peso;}

    public String getTraccion() {return traccion;}

    public void setTraccion(String traccion) {this.traccion = traccion;}

    public Fabricante getFabricante() {return fabricante;}

    public void setFabricante(Fabricante fabricante) {this.fabricante = fabricante;}

    public static int getCantidadVehiculos() {return CantidadVehiculos;}

    public static void setCantidadVehiculos(int cantidadVehiculos) {Vehiculo.CantidadVehiculos = cantidadVehiculos;}

    public Pais getPais() {return getFabricante().getPais();}

    public static String vehiculosPorTipo() {return String.format("Automoviles: %d\nCamionetas: %d\nCamiones: %d",Automovil.getCantidadAutomoviles(),Camioneta.getCantidadCamionetas(),Camion.getCantidadCamiones());}

}// Anti - copy : Carlos Yazid Padilla