public class IntsCalculator implements Ints {

    Calculator calculator;

    public IntsCalculator() {
        this.calculator = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) this.calculator.newFormula().addOperand(arg0).addOperand(arg1).calculate(Operation.SUM).result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) this.calculator.newFormula().addOperand(arg0).addOperand(arg1).calculate(Operation.MULT).result();
    }

    @Override
    public int pow(int a, int b) {
        return (int) this.calculator.newFormula().addOperand(a).addOperand(b).calculate(Operation.POW).result();
    }
}
