
package Objeto;


public class Pasajero {
    
  
    private String nombre;
    private String pasaporte;
    private String nacionalidad;

    public String getNombre() {
        return nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pasajero{");
        sb.append("nombre=").append(nombre);
        sb.append(", pasaporte=").append(pasaporte);
        sb.append(", nacionalidad=").append(nacionalidad);
        sb.append('}');
        return sb.toString();
    }
    
}
