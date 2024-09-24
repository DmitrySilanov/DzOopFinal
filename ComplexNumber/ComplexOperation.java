package ComplexNumber;

public class ComplexOperation {

    private final double re;
    private final double im;

    public ComplexOperation() {
        this.re = 0.0;
        this.im = 0.0;
    }

    public ComplexOperation(double re, double im) {
        this.re = re;
        this.im = im;
    }


    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    public ComplexOperation plus(ComplexOperation b){
        return new ComplexOperation(this.re + b.re,this.im + b.im);
    }
    public ComplexOperation multiply(ComplexOperation b){
        double multRe = this.re * b.re - this.im * b.im;
        double multIm = this.re * b.im + this.im * b.re;
        return new ComplexOperation(multRe,multIm);
    }
    public ComplexOperation divide(ComplexOperation b){
        double divDenominator = b.re * b.re + b.im * b.im;
        double divRe =(this.re * b.re + this.im * b.im)/divDenominator;
        double divIm =(this.im * b.re - this.re * b.im)/divDenominator;
        return new ComplexOperation(divRe, divIm);
    }
    public ComplexOperation minus(ComplexOperation b){
        return new ComplexOperation(this.re - b.re,this.im - b.im);
    }

    @Override
    public String toString() {
        if (this.im == 0) return this.re + "";
        if (this.re == 0) return this.im + "i";
        if (this.im < 0) return this.re + " - " + (-this.im) + "i";
        return this.re + " + " + this.im + "i";
    }
}
