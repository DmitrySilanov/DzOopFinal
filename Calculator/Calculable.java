package Calculator;

import ComplexNumber.ComplexOperation;

import java.util.concurrent.CompletionException;

public interface Calculable {
    Calculable sum(ComplexOperation arg);
    Calculable multi(ComplexOperation arg);
    Calculable div(ComplexOperation arg);
    Calculable minus(ComplexOperation arg);
    ComplexOperation getResult();
}
