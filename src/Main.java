public class Main {

    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        calculator.print.accept(calculator.abs.apply(4));
        calculator.print.accept(calculator.dev.apply(4, 5));
        calculator.print2.accept(calculator.pos.test(-9));
        calculator.print.accept(calculator.abs2.apply(-999784));


    }

}
