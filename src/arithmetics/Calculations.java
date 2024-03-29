package arithmetics;

public class Calculations {
    public double add(double a, double b){
        return a + b;
    }

    public double deduct(double a, double b){
        return a - b;
    }

    public double mult(double a, double b){
        return  a * b;
    }

    public double div(double a, double b){
        if (b == 0) throw new NullPointerException();
        return a / b;
    }
}
