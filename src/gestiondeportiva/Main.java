package gestiondeportiva;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rlascano
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos los componentes básicos
        Cancha futbol5 = new Cancha(1, "Césped Sintético", 2000.0);
        Socio socio1 = new Socio("S-01", "123", "Rodrigo", "111");
        Profesor profeTenis = new Profesor("Fútbol", "456", "Carlos", "222");

        // Polimorfismo: Guardamos diferentes tipos de reserva en una lista de tipo 'Reserva'
        List<Reserva> agendaDelDia = new ArrayList<>();
        List<Notificable> listaParaNotificar = new ArrayList<>();
        listaParaNotificar.add(socio1);        
        listaParaNotificar.add(profeTenis);

        for(Notificable n : listaParaNotificar) {
            n.enviarRecordatorio("Tenés un turno agendado para mañana");
        }

        // 1. Una reserva de turno libre de 2 horas con luces encendidas
        agendaDelDia.add(new ReservaTurnoLibre(true, futbol5, socio1, 2));

        // 2. Una reserva de clase dirigida de 2 horas con el profesor
        agendaDelDia.add(new ReservaClaseDirigida(profeTenis, futbol5, socio1, 2));

        // Recorremos la lista y ejecutamos el MISMO método para todas
        System.out.println("=== LIQUIDACIÓN DE TURNOS DEL DÍA ===");
        int i = 1;
        for (Reserva r : agendaDelDia) {
            // Java decide en el momento qué 'calcularTarifa()' ejecutar.
            // No nos importa si es turno libre o clase, el sistema sabe qué hacer.
            System.out.println("Turno " + i + " - Total a cobrar: $" + r.calcularTarifa());
            i++;
        }
    }

}
