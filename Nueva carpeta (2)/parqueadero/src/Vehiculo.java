
public class Vehiculo {

    private String placa;
    private String tipo;
    private String propietario;

    public Vehiculo(String placa, String tipo, String propietario) {
        this.placa = placa;
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo identificado con la placa=" + placa + ",es de  tipo=" + tipo + ", y su propietario es =" + propietario;

    }
}
