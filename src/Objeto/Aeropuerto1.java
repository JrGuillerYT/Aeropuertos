package Objeto;

public abstract class Aeropuerto1 {

    private String nombre;
    private String ciudad;
    private String pais;

    public Aeropuerto1(String nombre, String ciudad, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public abstract void mostrarInfo();

    public abstract String tipoAeropuerto();
}
