package Master;

import Objeto.AeropuertosPrivados;
import Objeto.AeropuertosPublicos;
import Objeto.Aeropuerto1;
import Objeto.Pasajero;
import Objeto.Vuelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aeropuerto {

    public static void main(String[] args) {

        // Crear instancias de Aeropuertos Públicos y Privados
        AeropuertosPublicos nose1public
                = new AeropuertosPublicos("Mohamed V", "Ciudad Rabat ",
                        "País Marruecos", 5000);

        AeropuertosPublicos nose2public
                = new AeropuertosPublicos("Moros", "Ciudad de Mexico",
                        "País Mexico", 7000);

        AeropuertosPrivados nose1priv
                = new AeropuertosPrivados("ElDorado", "Ciudad Bogota",
                        "País Colombia",
                        List.of("Ecopetrol", "Copetran"));

        // Crear lista combinada de aeropuertos
        List<Aeropuerto1> aeropuertos = new ArrayList<>();
        aeropuertos.add(nose1public);
        aeropuertos.add(nose2public);
        aeropuertos.add(nose1priv);

        // Menú interactivo
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--------------- Menú -----------------");
            System.out.println("1. Mostrar aeropuertos");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Aeropuertos disponibles:");
                    for (int i = 0; i < aeropuertos.size(); i++) {
                        System.out.println("Aeropuerto #" + (i + 1)
                                + " | Nombre: "
                                + aeropuertos.get(i).getNombre());
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del aeropuerto: ");
                    scanner.nextLine(); // Consumir salto de línea
                    String nombreBuscado = scanner.nextLine();
                    boolean encontrado = false;

                    for (Aeropuerto1 aeropuerto : aeropuertos) {
                        if (aeropuerto.getNombre()
                                .equalsIgnoreCase(nombreBuscado)) {
                            aeropuerto.mostrarInfo();
                            encontrado = true;
                            break;

                        }
                    }

                    System.out.print("¿Desea viajar desde este aeropuerto?"
                            + " (s/n): ");
                    String respuesta = scanner.nextLine();

                    if (respuesta.equalsIgnoreCase("s")) {

                        System.out.println("¡Excelente! Iniciando "
                                + "proceso de reserva...");

                        System.out.print("Ingrese la cantidad de pasajeros: ");
                        int numPasajeros = scanner.nextInt();

                        // Crear una lista para almacenar los datos de los pasajeros
                        List<Pasajero> pasajeros = new ArrayList<>();

                        // Solicitar datos de cada pasajero
                        for (int i = 1; i <= numPasajeros; i++) {

                            if (numPasajeros > 200) {
                                System.out.println("Lo sentimos, el número de "
                                        + "asientos seleccionados no es suficiente. "
                                        + "El vuelo tiene una capacidad máxima de "
                                        + "200 pasajeros.");
                             
                            } else {
                                System.out.println("¡Reserva confirmada! Has "
                                        + "reservado " + numPasajeros + " asientos.");
                                
                               
                            }
                            System.out.println("------------------------------");
                            System.out.println("Datos del pasajero " + i + ":");
                            Pasajero pasajero = new Pasajero();
                            System.out.print("Nombre completo: ");
                            pasajero.setNombre(scanner.next());
                            System.out.print("Número de pasaporte: ");
                            pasajero.setPasaporte(scanner.next());
                            System.out.print("Nacionalidad: ");
                            pasajero.setNacionalidad(scanner.next());
                            pasajeros.add(pasajero);
                            Vuelo vuelo = new Vuelo();
                            scanner.nextLine();
                            
                            System.out.print("\nIngrese el ID del vuelo: ");
                            String id = scanner.nextLine();

                            System.out.print("Ingrese la ciudad de origen: ");
                            String ciudadOrigen = scanner.nextLine();

                            System.out.print("Ingrese la ciudad de destino: ");
                            String ciudadDestino = scanner.nextLine();

                            System.out.print("El balor del vuelo es de: 150000 ");

                            System.out.println("¡Ingresa el valor del vuelo!");
                            double precio = scanner.nextDouble();

                            if (precio < 150000) {
                                System.out.println("Lo sentimos, la cantidad de "
                                        + "dinero que tiene no es suficiente "
                                        + "para realizar la compra.");
                            } else {
                                System.out.println("¡Felicitaciones! Tiene"
                                        + " suficiente dinero para comprar "
                                        + "el vuelo.");
                               
                            }
                            System.out.println("------------------------------");
                            

                        }
                        
                        System.out.println("¡Reserva realizada con éxito!");
                        System.out.println("Los datos de los pasajeros "
                                + "se han registrado.");
                      
                    } else {
                        System.out.println("Buscaré otro aeropuerto.");

                    }

                    if (!encontrado) {
                        System.out.println("Aeropuerto no encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        scanner.close(); 
    }
}
