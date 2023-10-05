package Calculator.Domain;


public class Calculator {

    private final Expression expression;
    private final Splitter splitter;

    public Calculator(Expression expression, Splitter splitter) {
        this.expression = expression;
        this.splitter = splitter;
    }

    public int calculate() {
        String[] values = splitter.splitExpression(expression);
        int result = Integer.parseInt(values[0]);

        for (int i = 1; i < values.length; i += 2) {
            int nextElement = Integer.parseInt(values[i + 1]);
            String operator = values[i];

            result = compute(nextElement, operator, result);
        }

        return result;
    }

    private int compute(
        int nextElement,
        String operator,
        int result
    ) {
        Operator operatorEnum = Operator.findOperator(operator);
        switch (operatorEnum) {
            case MULTIPLY:
                return result *= nextElement;
            case DIVIDE:
                return result /= nextElement;
            case ADD:
                return result += nextElement;
            case SUBTRACT:
                return result -= nextElement;
        }

        return result;
    }
}
