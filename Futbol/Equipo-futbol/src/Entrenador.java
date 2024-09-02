public class Entrenador {
    String nombre;
    String apellido;
    float salario;
    int experiencia;

    // constructor

    public Entrenador(String nombre, String apellido, float salario, int experiencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.experiencia = experiencia;
    }

    // Metodo Info
    public void mostrarInfo() {
        System.out.println("Nuestro entrenador " + nombre + " " + apellido + ", tiene un salario de: " + salario + " euros mensuales. Y cuenta con  " + experiencia + " años de experiencia ");
    }
}
