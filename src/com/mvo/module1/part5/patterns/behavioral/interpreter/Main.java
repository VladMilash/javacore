package src.com.mvo.module1.part5.patterns.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression addExpression = new AddExpression(10, 5);
        Expression subtractExpression = new SubtractExpression(10, 5);

        Context context = new Context();

        System.out.println("10 + 5 = " + context.interpret(addExpression));
        System.out.println("10 - 5 = " + context.interpret(subtractExpression));
    }
}

