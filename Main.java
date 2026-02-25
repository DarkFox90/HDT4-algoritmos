import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        
        Controller controller = new Controller(calculator);

        controller.ReadFile();

        System.out.println("Seleccione su implementacion de stack deseada: ");
        System.out.println("1. ArrayList");
        System.out.println("2. vector");
        System.out.println("3. lista");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                
                break;
            case 2:

                break;
            case 3:
                System.out.println("que tipo de lista desea usar: ");
                System.out.println("1. simplemente encadenada");
                System.out.println("2. doblemente encadenada");
                int opcion2 = sc.nextInt();
                
                if (opcion2 == 1) {

                } else if (opcion2 == 2) {

                } else {
                    System.out.println("opcion invalida.");
                }
            
            default:
                throw new AssertionError();
        }
        sc.close();
    }
}