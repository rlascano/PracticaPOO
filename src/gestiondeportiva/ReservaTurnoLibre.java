package gestiondeportiva;

/**
 *
 * @author Rodrigo Lascano
 */
public class ReservaTurnoLibre extends Reserva {
    private boolean usaLuces;

    public ReservaTurnoLibre(boolean usaLuces, Cancha cancha, Socio socio, int horas) {
        super(cancha, socio, horas);
        this.usaLuces = usaLuces;
    }
    
    @Override
    public double calcularTarifa() {
        double tarifaBase = getCancha().calcularCosto(getHoras());
        
        if(usaLuces) {
            tarifaBase += (getHoras() * 500);
        }
        
        return tarifaBase;
    }
}
