
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author juand
 */
public class Usuario {
   private String nombre;
    private String apellido;
    private String cedula;
    private String email;
    private String genero;
    private String fechaNacimiento;
    private Map<String, Double> registrosPeso;

    public Usuario(String nombre, String apellido, String cedula, String email, String genero, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.email = email;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.registrosPeso = new HashMap<>();
    }

    // Método público para agregar un registro de peso
    public void agregarRegistroPeso(String fecha, double peso) {
        if (peso > 0) {
            registrosPeso.put(fecha, peso);
            System.out.println("Registro de peso agregado correctamente.");
        } else {
            System.out.println("El peso debe ser mayor que 0.");
        }
    }

    // Método protegido para obtener el nombre completo del usuario
    protected String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }

    // Métodos getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getCedula() { return cedula; }
    public String getEmail() { return email; }
    public String getGenero() { return genero; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public Map<String, Double> getRegistrosPeso() { return registrosPeso; }
}

   

