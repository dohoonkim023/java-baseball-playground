package Calculator.Domain;


public class Expression {

    private final String expression;

    public Expression(String expression) {
        if (expression.isEmpty()) {
            throw new RuntimeException();  //messsage 넣기
        }
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

}
