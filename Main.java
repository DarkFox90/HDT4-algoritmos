import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = Calculator.getInstance();
        Controller controller = new Controller(calculator);
        StackFactory<Integer> factory1 = new StackFactory<>();

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("Seleccione su implementacion de stack deseada: ");
            System.out.println("1. ArrayList");
            System.out.println("2. vector");
            System.out.println("3. lista");
            System.out.println("4. salir");

            opcion = sc.nextInt();
            Stack<Integer> stack = null;

            switch (opcion) {
                case 1:
                    stack = factory1.getStack("ArrayList", null);
                    break;
                case 2:
                    stack = factory1.getStack("Vector", null);
                    break;
                case 3:
                    System.out.println("que tipo de lista desea usar: ");
                    System.out.println("1. simplemente encadenada");
                    System.out.println("2. doblemente encadenada");
                    int opcion2 = sc.nextInt();

                    switch (opcion2) {
                        case 1:
                            stack = factory1.getStack("List", "SIMPLE");
                            break;
                        case 2:
                            stack = factory1.getStack("List", "DOBLE");
                            break;
                        default:
                            System.out.println("opcion invalida.");
                            sc.close();
                            return;
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    throw new AssertionError();
            }

            if (stack != null) {
                calculator.PostfixCalculator(stack);
                controller.ReadFile();
            }
        }
        sc.close();
    }
}