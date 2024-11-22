
public class Main {

    public static void main(String[] args) {
        GestionParqueadero gestion = new GestionParqueadero();

        Vehiculo v1 = new Vehiculo("ABC123", "carro", "Juan Pérez");
        Vehiculo v2 = new Vehiculo("XYZ789", "moto", "María López");

        gestion.registrarVehiculo(v1);
        gestion.registrarVehiculo(v2);

        EspacioParqueadero e1 = new EspacioParqueadero(1, "carro");
        EspacioParqueadero e2 = new EspacioParqueadero(2, "moto");

        gestion.agregarEspacio(e1);
        gestion.agregarEspacio(e2);

        gestion.mostrarEspaciosDisponibles();

        gestion.asignarEspacio("ABC123");
        gestion.asignarEspacio("XYZ789");

        gestion.mostrarEspaciosDisponibles();

        e1.liberarEspacio();

        gestion.mostrarEspaciosDisponibles();

    }
}
