package Calculator;

import ComplexNumber.ComplexOperation;

public interface ICalculableFactory {
    Calculable create(ComplexOperation firstArg);

}
