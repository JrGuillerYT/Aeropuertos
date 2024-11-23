package Objeto;

public class AeropuertosPublicos extends Aeropuerto1 {

    private double presupuestoGobierno;

    public AeropuertosPublicos(String nombre,
            String ciudad, String pais, double presupuestoGobierno) {
        super(nombre, ciudad, pais);
        this.presupuestoGobierno = presupuestoGobierno;
    }

    public double getPresupuestoGobierno() {
        return presupuestoGobierno;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Aeropuerto Público: " + getNombre());
        System.out.println("Ubicación: " + getCiudad() + ", " + getPais());
        System.out.println("Presupuesto del Gobierno: $" + presupuestoGobierno);
        
    }

    @Override
    public String tipoAeropuerto() {
        return "Público";
    }
}
