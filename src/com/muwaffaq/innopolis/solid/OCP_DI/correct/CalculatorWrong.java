//❌❌❌❌
// how many SOLID Principle does it violate ?
// Fix it !!

// l - r
// r + l
// DI : high = Abstract class
// low : classes
//

interface Operator{
    double apply(double left, double right);
}

class Addition implements Operator{
    @Override
    public double apply(double left, double right) {
        return left + right;
    }
}
class Subtraction implements Operator{
    @Override
    public double apply(double left, double right) {
        return left - right;
    }
}
class Division implements Operator{
    @Override
    public double apply(double left, double right) {
        return left / right;
    }
}
class Multiplication implements Operator{
    @Override
    public double apply(double left, double right) {
        return left * right;
    }
}

class CalculatorWrong {
    private double left;
    private double right;
    
    public  double calculate(Operator operation) {
        return operation.apply(left, right);
    }

    public static void main(String[] args) {
        CalculatorWrong calculator = new CalculatorWrong();
        Addition addition = new Addition();
        System.out.println(calculator.calculate(addition));
        calculator.calculate(addition);
    }

}


