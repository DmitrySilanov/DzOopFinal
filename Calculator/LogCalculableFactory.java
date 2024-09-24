package Calculator;

import ComplexNumber.ComplexOperation;

public class LogCalculableFactory implements ICalculableFactory {

    private final Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(ComplexOperation firstArg) {
        return new LogCalculator(new Calculator(firstArg), this.logger);
    }
}

