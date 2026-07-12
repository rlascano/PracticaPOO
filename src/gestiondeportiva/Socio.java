package gestiondeportiva;

/**
 *
 * @author rlascano
 */
public class Socio extends Persona implements Notificable {
    private String idSocio;
    private boolean matriculaAlDia;

    public Socio(String idSocio, String dni, String nombre, String telefono) {
        super(dni, nombre, telefono);
        this.idSocio = idSocio;
        this.matriculaAlDia = true;
    }    
    
    public void pagarCouta() {
        this.matriculaAlDia = true;
        IO.println(getNombre() + " ha pagado la cuota. Matrícula activa");
    }    
    
    public boolean puedeReservar() {
        return this.matriculaAlDia;
    }

    public String getIdSocio() {
        return idSocio;
    }         
    
    @Override
    public void enviarRecordatorio(String mensaje) {
        System.out.println("[NOTIFICACIÓN SMS al Socio " + getNombre() + "]: "
                + mensaje);
    }
}
