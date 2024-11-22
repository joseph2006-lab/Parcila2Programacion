
public class EspacioParqueadero {

    private int numeroEspacio;

    public void setNumeroEspacio(int numeroEspacio) {
        this.numeroEspacio = numeroEspacio;
    }

    private String tipoPermitido;

    public void setTipoPermitido(String tipoPermitido) {
        this.tipoPermitido = tipoPermitido;
    }

    private boolean ocupado;

    public EspacioParqueadero(int numeroEspacio, String tipoPermitido) {
        this.numeroEspacio = numeroEspacio;
        this.tipoPermitido = tipoPermitido;
        this.ocupado = false;
    }

    public int getNumeroEspacio() {
        return numeroEspacio;
    }

    public String getTipoPermitido() {
        return tipoPermitido;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void asignarVehiculo(Vehiculo vehiculo) {
        if (!ocupado && vehiculo.getTipo().equals(tipoPermitido)) {
            ocupado = true;
            System.out.println("Vehículo asignado al espacio " + numeroEspacio);
        } else {
            System.out.println("No se puede asignar el vehículo al espacio " + numeroEspacio);
        }
    }

    public void liberarEspacio() {
        if (ocupado) {
            ocupado = false;
            System.out.println("Espacio " + numeroEspacio + " liberado.");
        } else {
            System.out.println("El espacio " + numeroEspacio + " ya está disponible.");
        }
    }

    @Override
    public String toString() {
        return "EspacioParqueadero numeroEspacio=" + numeroEspacio + ", tipoPermitido=" + tipoPermitido
                + ", ocupado=" + ocupado;
    }
}
