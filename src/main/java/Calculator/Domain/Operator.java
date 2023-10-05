package Calculator.Domain;

public enum Operator {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String operator;

    Operator(String operator) {
        this.operator = operator;
    }

    public static Operator findOperator(String operator) {
        for (Operator value : values()) {
            if (value.operator.equals(operator)) {
                return value;
            }
        }
        throw new RuntimeException(); //message 넣기
    }

    public String getOperator() {
        return operator;
    }
}
