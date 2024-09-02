public class Directivo {
    String nombre;
    String apellido;
    float salario;
    boolean fumaPuros;

    public Directivo(String nombre, String apellido, float salario, boolean fumaPuros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.fumaPuros = fumaPuros;
    }
    
    public void mostrarInfo() {
        String fuma = fumaPuros ? "Si" : "No";
        System.out.println("Nuestro directivo: " + nombre + " " + apellido + " Quien recibe unos: " + salario + " Euros al mes, se los gastará en puros? " + fuma);

    }

} 


