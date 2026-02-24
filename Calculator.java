public class Calculator implements Calc {

    private Stack<Integer> stack;
    private static Calculator calculator;

    private Calculator() {
    }

    public static Calculator getInstance() {
        if (calculator == null) {
            calculator = new Calculator();
        }
        return calculator;
    }

    public void PostfixCalculator(Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public double operate(String input) {
        String[] tokens = input.split(" ");
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public boolean isNumeric(String num) {
    }   
}