import java.util.Scanner;

/**
 *
 * @author juand
 */
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Hola! Bienvenido/a al sistema de gestión de salud.");
        System.out.println("Vamos a empezar recopilando algunos datos personales.\n");

        // Solicitar datos del usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ahora, ingresa tu apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingresa tu número de cédula: ");
        String cedula = scanner.nextLine();

        System.out.print("Ingresa tu dirección de email: ");
        String email = scanner.nextLine();

        System.out.print("Indica tu género (por ejemplo, Masculino, Femenino, Otro): ");
        String genero = scanner.nextLine();

        System.out.print("Finalmente, ingresa tu fecha de nacimiento (formato: YYYY-MM-DD): ");
        String fechaNacimiento = scanner.nextLine();

        // Crear un objeto Usuario
        Usuario usuario = new Usuario(nombre, apellido, cedula, email, genero, fechaNacimiento);

        System.out.println("\nGracias por la información, " + nombre + ".");
        System.out.println("Ahora vamos a registrar tu peso a lo largo del tiempo.\n");

        // Solicitar registros de peso
        System.out.print("¿Cuántos registros de peso te gustaría agregar?: ");
        int numRegistros = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        for (int i = 0; i < numRegistros; i++) {
            System.out.print("Ingresa la fecha del registro " + (i + 1) + " (YYYY-MM-DD): ");
            String fechaRegistro = scanner.nextLine();

            System.out.print("Ingresa el peso en kg para esa fecha: ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            usuario.agregarRegistroPeso(fechaRegistro, peso);
        }

        // Solicitar datos para calcular el IMC
        System.out.println("\nPerfecto. Ahora, para calcular tu Índice de Masa Corporal (IMC), necesitamos un par de datos más.");
        System.out.print("Ingresa tu peso actual en kg: ");
        double pesoActual = scanner.nextDouble();

        System.out.print("Ingresa tu altura en metros (por ejemplo, 1.75): ");
        double altura = scanner.nextDouble();

        // Crear un objeto IMC
        IMC imc = new IMC(pesoActual, altura, usuario);

        // Calcular y mostrar el IMC
        System.out.println("\nGracias, " + nombre + ". Aquí están tus resultados:");
        System.out.println("Tu IMC es: " + imc.calcularIMC());
        System.out.println("Clasificación del IMC: " + imc.clasificacionIMC());
    }
}
