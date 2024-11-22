
import java.util.ArrayList;
import java.util.List;

public class GestionParqueadero {

    private List<Vehiculo> vehiculos;

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<EspacioParqueadero> getEspacios() {
        return espacios;
    }

    public void setEspacios(List<EspacioParqueadero> espacios) {
        this.espacios = espacios;
    }

    private List<EspacioParqueadero> espacios;

    public GestionParqueadero() {
        this.vehiculos = new ArrayList<>();
        this.espacios = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado: " + vehiculo);
    }

    public void agregarEspacio(EspacioParqueadero espacio) {
        espacios.add(espacio);
        System.out.println("Espacio agregado: " + espacio);
    }

    public void mostrarEspaciosDisponibles() {
        System.out.println("Espacios disponibles:");
        for (EspacioParqueadero espacio : espacios) {
            if (!espacio.isOcupado()) {
                System.out.println(espacio);
            }
        }
    }

    public void asignarEspacio(String placa) {
        Vehiculo vehiculo = buscarVehiculo(placa);
        if (vehiculo == null) {
            System.out.println("Vehículo no encontrado.");
            return;
        }

        for (EspacioParqueadero espacio : espacios) {
            if (!espacio.isOcupado() && espacio.getTipoPermitido().equals(vehiculo.getTipo())) {
                espacio.asignarVehiculo(vehiculo);
                return;
            }
        }
        System.out.println("No hay espacios disponibles para el vehículo con placa: " + placa);
    }

    private Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }
}
