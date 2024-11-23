package Objeto;

import java.util.ArrayList;

public class Vuelo {

    private String id;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int totalAsientos;
    private int asientosReservados;
    private ArrayList<Pasajero> pasajeros;

    public String getId() {
        return id;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTotalAsientos() {
        return totalAsientos;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTotalAsientos(int totalAsientos) {
        this.totalAsientos = totalAsientos;
    }

    public void setAsientosReservados(int asientosReservados) {
        this.asientosReservados = asientosReservados;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vuelo{");
        sb.append("id=").append(id);
        sb.append(", ciudadOrigen=").append(ciudadOrigen);
        sb.append(", ciudadDestino=").append(ciudadDestino);
        sb.append(", precio=").append(precio);
        sb.append(", totalAsientos=").append(totalAsientos);
        sb.append(", asientosReservados=").append(asientosReservados);
        sb.append(", pasajeros=").append(pasajeros);
        sb.append('}');
        return sb.toString();
    }

    public void agregarPasajero(Pasajero pasajero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
