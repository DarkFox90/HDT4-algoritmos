import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Calculator calculator = Calculator.getInstance();
        Controller controller = new Controller(calculator);
        StackFactory<Integer> factory1 = new StackFactory<>();

    
        System.out.println("Seleccione su implementacion de stack deseada: ");
        System.out.println("1. ArrayList");
        System.out.println("2. vector");
        System.out.println("3. lista");

        int opcion = sc.nextInt();
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

                if (opcion2 == 1) {
                    
                } else if (opcion2 == 2) {

                } else {
                    System.out.println("opcion invalida.");
                    sc.close();
                }
            
            default:
                throw new AssertionError();
        }
        calculator.PostfixCalculator(stack);
        controller.ReadFile();
        sc.close();
    }
}