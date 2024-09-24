package Calculator;

import ComplexNumber.ComplexOperation;

public class Calculator implements Calculable {


    private ComplexOperation resultCalculation;

    public Calculator(ComplexOperation firstArg) {
        this.resultCalculation = firstArg;
    }

    @Override
    public Calculable sum(ComplexOperation arg) {
        this.resultCalculation = this.resultCalculation.plus(arg);
        return this;
    }

    @Override
    public Calculable multi(ComplexOperation arg) {
        this.resultCalculation = this.resultCalculation.multiply(arg);
        return this;
    }

    @Override
    public Calculable div(ComplexOperation arg) {
        this.resultCalculation = this.resultCalculation.divide(arg);
        return this;
    }

    @Override
    public Calculable minus(ComplexOperation arg) {
        this.resultCalculation = this.resultCalculation.minus(arg);
        return this;
    }

    @Override
    public ComplexOperation getResult() {
        return resultCalculation;
    }
}