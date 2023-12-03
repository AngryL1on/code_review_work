public class Calculator {
    public int add(int a, int b){
        return a+b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b) throws Exception {
        if (a == 0 || b == 0) {
            throw new Exception("Operation cannot be performed");
        }
        return a / b;
    }

    public int times(int a, int b){
        return (a * b);
    }

    public double solver(int a, int b) throws Exception {
        // Solution of linear equation: ax + b = 0
        if (a == 0 || b == 0) {
            throw new Exception("Operation cannot be performed");
        } else {
            return div(dif(0, b), a);
        }
    }
}
