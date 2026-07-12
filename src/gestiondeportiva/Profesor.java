package gestiondeportiva;

/**
 *
 * @author rlascano
 */
public class Profesor extends Persona implements Notificable {
    private String especialidad;

    public Profesor(String especialidad, String dni, String nombre, String telefono) {
        super(dni, nombre, telefono);
        this.especialidad = especialidad;
    }
    
    public void darClase() {
        System.out.println("El profesor " + getNombre() + " está dictando una clase de " + especialidad + ".");
    }

    public String getEspecialidad() {
        return especialidad;
    }  
    
    @Override
    public void enviarRecordatorio(String mensaje) {
        System.out.println("[NOTIFICACIÓN EMAIL al Profesor " + getNombre() + "]: " + mensaje);
    }
}
