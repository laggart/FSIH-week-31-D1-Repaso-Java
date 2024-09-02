import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in); // Abrimos el teclado 
        ArrayList<String> pedidos = new ArrayList<>(); // Generamos el array List donde guardaremos los platos
        String plato; // generamos la variable para almacenar los platos
        Boolean control = true;
        
        while (control) { // Bucle infinito que se termina al 'salir'
            System.out.println("¿Qué te gustaría comer?");
            plato = teclado.nextLine(); //leemos lo que el usuario escribe

            if (plato.equalsIgnoreCase("salir")) { // Si escribe Salir se termina el programa
                control = false;
            }
            if (plato.equalsIgnoreCase("fabada")){
                System.out.println("yo de ti no haría eso forastero");
            }

            pedidos.add(plato); //añadimos el plato al array pedidos
            System.out.println("Has pedido " + plato);

            System.out.println("Hasta ahora has pedido:");
            for (String pedido : pedidos) {
                System.out.println("- " + pedido); // Mostramos lo que va pidiendo 
            }

            if (pedidos.size() == 5) {
                System.out.println("¡Vas a reventar!");
            }            
        }

        System.out.println("Has pedido " + pedidos.size() + " platos. ¡Que aproveche!"); // mostramos la cantidad de platos pedidos
        teclado.close();
    }
}
