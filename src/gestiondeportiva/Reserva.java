package gestiondeportiva;

/**
 *
 * @author Rodrigo Lascano
 */
public abstract class Reserva {
    private Cancha cancha;
    private Socio socio;
    private int horas;

    public Reserva(Cancha cancha, Socio socio, int horas) {
        this.cancha = cancha;
        this.socio = socio;
        this.horas = horas;
    }
    
    public abstract double calcularTarifa();

    public Cancha getCancha() {
        return cancha;
    }

    public Socio getSocio() {
        return socio;
    }

    public int getHoras() {
        return horas;
    }    
}
