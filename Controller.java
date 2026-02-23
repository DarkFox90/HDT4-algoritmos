import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Controller {

    private Calc calculator;

    public Controller(Calc calculator) {
        this.calculator = calculator;
        ReadFile();
    }

    public void ReadFile() {
        String filePath = "datos.txt";   

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) { 
                String postfix = infixToPostfix(line);
                double outcome = calculator.operate(postfix);
                System.out.println(outcome);
            } 
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
        catch(IOException e) {
            System.out.println("algo salio mal");
        }
    }

    private String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char x = infix.charAt(i);
            if (Character.isLetterOrDigit(x)) {
                postfix.append(x).append(" "); 
            } 
            else if (x == '(') {
                stack.push(x);
            } 
            else if (x == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.pop(); 
            } 
            else if (x == '+' || x == '-' || x == '*' || x == '/') {
                while (!stack.isEmpty() && precedence(x) <= precedence(stack.peek())) {
                    postfix.append(stack.pop()).append(" ");
                }
                stack.push(x);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(" ");
        }
        return postfix.toString().trim(); 
    }

    private int precedence(char x) {
        switch (x) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
