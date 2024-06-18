package src.com.mvo.module1.part5.patterns.behavioral.interpreter;

class SubtractExpression implements Expression {
    private final int number1;
    private final int number2;

    public SubtractExpression(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int interpret() {
        return number1 - number2;
    }
}
