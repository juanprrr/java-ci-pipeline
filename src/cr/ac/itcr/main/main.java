package cr.ac.itcr.main;

public class main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res = calc.sum(10,5);
        System.out.println("Sum 10 + 5 = " + res);

        res = calc.subtract(10,5);
        System.out.println("Subtract 10 - 5 = " + res);

        res = calc.multiply(10,5);
        System.out.println("Multiply 10 * 5 = " + res);

        res = calc.divide(10,5);
        System.out.println("Subtract 10 / 5 = " + res);
    }
}
