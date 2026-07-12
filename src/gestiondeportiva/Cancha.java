package gestiondeportiva;

/**
 *
 * @author rlascano
 */
public class Cancha {

    private int numero;
    private String tipoSuperficie;
    private double precioBasePorHora;

    public Cancha(int numero, String tipoSuperficie, double precioBasePorHora) {
        this.numero = numero;
        this.tipoSuperficie = tipoSuperficie;
        this.precioBasePorHora = precioBasePorHora;
    }

    // Método de negocio
    public double calcularCosto(int horas) {
        return this.precioBasePorHora * horas;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public String getTipoSuperficie() {
        return tipoSuperficie;
    }

    public double getPrecioBasePorHora() {
        return precioBasePorHora;
    }

    public void setPrecioBasePorHora(double precioBasePorHora) {
        if (precioBasePorHora > 0) { // Validación perimetral
            this.precioBasePorHora = precioBasePorHora;
        }
    }
}
