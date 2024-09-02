public class Futbolista {

    String nombre;
    String apellido;
    float salario;
    int golesMarcados;
    int tarjetasRecibidas;


    public Futbolista(String nombre, String apellido, float salario, int golesMarcados, int tarjetasRecibidas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.golesMarcados = golesMarcados;
        this.tarjetasRecibidas = tarjetasRecibidas;
    }

    // Método celebrar gol
    public void celebrarGol() {
        System.out.println(nombre + " " + apellido + " dice... SIUUUUUUUUUUUU!!!!!!! ");
        
    }

    //Método mostrar info
    public void mostrarInfo() {
        System.out.println("El jugador " + nombre + " " + apellido + ", gana la modica suma de: " + salario + " Euros al mes. Esta temporada nos ha regalado " + golesMarcados + " Goles y ha recibido " + tarjetasRecibidas + " tarjetas." );
    } 
}
