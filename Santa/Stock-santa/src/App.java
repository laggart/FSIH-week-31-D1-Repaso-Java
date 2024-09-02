import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce el valor inicial del stock de regalos");
        int stock = teclado.nextInt(); // Cantidad inicial de regalos, puedes cambiar este valor

        while (stock > 0) {
            System.out.print("¿Cuántos regalos has repartido hoy? ");
            int repartidos = teclado.nextInt();
            stock -= repartidos;

            if (stock < 100 && stock > 0) {
                System.out.println("¡Ojo, quedan menos de 100 regalos!");
            }
        }

        System.out.println("Misión cumplida. ¡Hasta el año que viene!");
        teclado.close();
    }
}
