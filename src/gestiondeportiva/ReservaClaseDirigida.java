package gestiondeportiva;

/**
 *
 * @author Rodrigo Lascano
 */
public class ReservaClaseDirigida extends Reserva {

    private Profesor profesor;

    public ReservaClaseDirigida(Profesor profesor, Cancha cancha, Socio socio, int horas) {
        super(cancha, socio, horas);
        this.profesor = profesor;
    }

    @Override
    public double calcularTarifa() {
        double costoCancha = getCancha().calcularCosto(getHoras());
        double honorariosProfesor = 1200.0 * getHoras();
        double total = costoCancha + honorariosProfesor;

        // Aprovechamos el método que creamos en el Punto 1
        if (getSocio().puedeReservar()) {
            total = total * 0.90; // 10% de descuento
        }
        return total;
    }
}
