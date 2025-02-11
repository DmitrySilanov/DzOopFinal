package Calculator;

import ComplexNumber.ComplexOperation;

public class LogCalculator implements Calculable {

    private final Calculable oldCalc;
    private final Loggable logger;

    public LogCalculator(Calculable oldCalc, Loggable logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public Calculable sum(ComplexOperation arg) {
        ComplexOperation firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода sum с параметром %s", firstArg, arg));
        Calculable result = oldCalc.sum(arg);
        logger.log("Вызов метода sum произошел.");
        return result;
    }

    @Override
    public Calculable multi(ComplexOperation arg) {
        ComplexOperation firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода multi с параметром %s", firstArg, arg));
        Calculable result = oldCalc.multi(arg);
        logger.log("Вызов метода multi произошел.");
        return result;
    }

    @Override
    public Calculable div(ComplexOperation arg) {
        ComplexOperation firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода div с параметром %s", firstArg, arg));
        Calculable result = oldCalc.div(arg);
        logger.log("Вызов метода div произошел.");
        return result;
    }

    @Override
    public Calculable minus(ComplexOperation arg) {
        ComplexOperation firstArg = oldCalc.getResult();
        logger.log(String.format("Значение калькулятора %s. Начало вызова метода minus с параметром %s", firstArg, arg));
        Calculable result = oldCalc.minus(arg);
        logger.log("Вызов метода minus произошел.");
        return result;
    }

    @Override
    public ComplexOperation getResult() {
        ComplexOperation result = oldCalc.getResult();
        logger.log(String.format("Получение результата %s", result));
        return result;
    }
}
