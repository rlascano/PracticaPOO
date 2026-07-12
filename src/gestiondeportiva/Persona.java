package gestiondeportiva;

/**
 *
 * @author rlascano
 */
public class Persona {
    private String dni;       
    private String nombre;       
    private String telefono;

    public Persona(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | DNI: " + dni);
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }         
}
