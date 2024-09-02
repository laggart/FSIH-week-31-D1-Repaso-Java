public class App {
    public static void main(String[] args) throws Exception {
       // Instanciar futbolistas
       Futbolista[] futbolistas = {
        new Futbolista("Lionel", "Messi", 500000f, 30, 2),
        new Futbolista("Cristiano", "Ronaldo", 550000f, 35, 3),
        new Futbolista("Neymar", "Junior", 450000f, 25, 4),
        new Futbolista("Kylian", "Mbappe", 400000f, 28, 1),
        new Futbolista("Luka", "Modric", 300000f, 15, 2),
        new Futbolista("Sergio", "Ramos", 350000f, 10, 5),
        new Futbolista("Karim", "Benzema", 320000f, 20, 1),
        new Futbolista("Virgil", "Van Dijk", 310000f, 8, 3),
        new Futbolista("Kevin", "De Bruyne", 400000f, 18, 0),
        new Futbolista("Sadio", "Mane", 370000f, 22, 2),
        new Futbolista("Mohamed", "Salah", 360000f, 26, 1)
    }; 
        // Instanciar entrenadores
        Entrenador[] entrenadores = {
        new Entrenador("Pep", "Guardiola", 700000, 10),
        new Entrenador("Jurgen", "Klopp", 650000, 12)
    };

        //Instanciar Directivo
        Directivo directivo = new Directivo("Florentino", "Perez", 1000000, true);

        //Info todos
        System.out.println("Información de los futbolistas:");
        for (Futbolista futbolista : futbolistas) {
            futbolista.mostrarInfo();
        }

        System.out.println("\nInformación de los entrenadores:");
        for (Entrenador entrenador : entrenadores) {
            entrenador.mostrarInfo();
        }

        System.out.println("\nInformación del directivo:");
        directivo.mostrarInfo();

        // Calcular y mostrar la media de los salarios
        float salarioTotal = 0;
        int totalTrabajadores = futbolistas.length + entrenadores.length + 1; //el directivo no se puede quedar fuera

        for (Futbolista futbolista : futbolistas) {
            salarioTotal += futbolista.salario;
        }

        for (Entrenador entrenador : entrenadores) {
            salarioTotal += entrenador.salario;
        }

        salarioTotal += directivo.salario;

        float salarioMedio = salarioTotal / totalTrabajadores;
        System.out.println(" El salario medio de la plantilla es de: " + salarioMedio + "Euros mensuales");

        // Celebrando el gol
        futbolistas[1].celebrarGol();

    }
}


// STOCK DE SANTA KLAUS - WHILE
// Desde Finlandia, te encargan que te hagas cargo el stock de Papa Noel.


// Tienes una cantidad inicial de regalos para repartir. Puedes inventártela, o pedirla al usuario


// Tu eres un duende. Te va preguntando: ¿cuántos regalos has repartido hoy?

// Cuando queden menos de 100 del stock, avisar (ojo, quedan menos de 100 regalos!)

// Cuando se acaben los regalos, decir mensaje : “misión cumplida. Hasta el año que viene!”