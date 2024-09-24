package Calculator;

import ComplexNumber.ComplexOperation;

public class CalculableFactory implements ICalculableFactory{

    @Override
    public Calculable create(ComplexOperation firstArg) {
        return new Calculator(firstArg);
    }
}