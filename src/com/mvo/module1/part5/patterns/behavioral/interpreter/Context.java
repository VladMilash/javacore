package src.com.mvo.module1.part5.patterns.behavioral.interpreter;

public class Context {
    public int interpret(Expression expression) {
        return expression.interpret();
    }
}
