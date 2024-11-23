package Objeto;

import java.util.List;

public class AeropuertosPrivados extends Aeropuerto1 {

    private List<String> empresasPatrocinadoras;

    public AeropuertosPrivados(String nombre,
            String ciudad, String pais,
            List<String> empresasPatrocinadoras) {
        super(nombre, ciudad, pais);
        this.empresasPatrocinadoras = empresasPatrocinadoras;
    }

    public List<String> getEmpresasPatrocinadoras() {
        return empresasPatrocinadoras;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Aeropuerto Privado: " + getNombre());
        System.out.println("Ubicación: " + getCiudad() + ", " + getPais());
        System.out.println("Empresas Patrocinadoras:");
        for (String empresa : empresasPatrocinadoras) {
            System.out.println(" - " + empresa);
        }
    }

    @Override
    public String tipoAeropuerto() {
        return "Privado";
    }
}
