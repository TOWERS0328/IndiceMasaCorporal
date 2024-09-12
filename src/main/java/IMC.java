

/**
 *
 * @author juand
 */
public class IMC {
      private double peso; // peso actual
    private double altura;
    private Usuario usuario;

    public IMC(double peso, double altura, Usuario usuario) {
        this.peso = peso;
        this.altura = altura;
        this.usuario = usuario;
    }

    // Método público para calcular el IMC
    public double calcularIMC() {
        if (altura <= 0) {
            System.out.println("La altura debe ser mayor que 0.");
            return 0;
        }
        return peso / (altura * altura);
    }

    // Método protegido para obtener una clasificación del IMC
    protected String clasificacionIMC() {
        double imc = calcularIMC();
        if (imc == 0) {
            return "Error en el cálculo del IMC.";
        } else if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    // Métodos getters
    public double getPeso() { return peso; }
    public double getAltura() { return altura; }
    public Usuario getUsuario() { return usuario; }

}
