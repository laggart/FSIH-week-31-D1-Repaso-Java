import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce la altura del rectangulo");
        int altura = teclado.nextInt();
    
        System.out.println("introduce la anchura del rectangulo");
        int anchura = teclado.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        teclado.close();


    }
}
