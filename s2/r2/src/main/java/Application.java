import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = 0;

        int option = 0;

        while (option != 5) {
            System.out.println("\nValor actual: " + counter);
            System.out.println("Elige alguna opción:");
            System.out.println("1. Incrementa en uno el contador");
            System.out.println("2. Multiplica por 2 el contador");
            System.out.println("3. Añade 10 al contador");
            System.out.println("4. Deshacer último cambio");
            System.out.println("5. Salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    counter += 1;
                    break;
                case 2:
                    counter *= 2;
                    break;
                case 3:
                    counter += 10;
                    break;
                case 4:
                    // No implementado...
                    break;
            }
        }
    }
}