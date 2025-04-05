
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menú de Lista Enlazada ---");
            System.out.println("1. Agregar al final");
            System.out.println("2. Agregar al inicio");
            System.out.println("3. Agregar en posición específica");
            System.out.println("4. Eliminar por valor");
            System.out.println("5. Imprimir lista");
            System.out.println("6. Invertir lista");
            System.out.println("7. Verificar si existe valor");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingrese el valor a agregar: ");
                    int valueToAdd = scanner.nextInt();
                    list.add(valueToAdd);
                    break;
                case 2:
                    System.out.print("Ingrese el valor a agregar al inicio: ");
                    valueToAdd = scanner.nextInt();
                    list.addFirst(valueToAdd);
                    break;
                case 3:
                    System.out.print("Ingrese el valor a agregar: ");
                    valueToAdd = scanner.nextInt();
                    System.out.print("Ingrese la posición: ");
                    int position = scanner.nextInt();
                    list.addMiddle(valueToAdd, position);
                    break;
                case 4:
                    System.out.print("Ingrese el valor a eliminar: ");
                    int valueToRemove = scanner.nextInt();
                    list.remove(valueToRemove);
                    break;
                case 5:
                    System.out.print("Lista: ");
                    list.printList();
                    break;
                case 6:
                    list.reverse();
                    System.out.println("Lista invertida.");
                    break;
                case 7:
                    System.out.print("Ingrese el valor a buscar: ");
                    int valueToFind = scanner.nextInt();
                    System.out.println("¿Contiene el valor? " + list.contains(valueToFind));
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
