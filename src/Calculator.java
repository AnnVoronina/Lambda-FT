import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new; // Создали интерфейс который возвращает переменную типа калькулятор
    BinaryOperator<Integer> sum = (a, b) -> (a + b); // добавили бинарный интерфейс, который принимает две переменных а возвращает одно значение
    BinaryOperator<Integer> sub = (a, b) -> (a - b);
    BinaryOperator<Integer> mul = (a, b) -> (a * b);
    BinaryOperator<Integer> dev = (a, b) -> (b!=0 ? a / b :0);
    UnaryOperator<Integer> pow = a -> a * a;
    UnaryOperator<Integer> abs = a -> (Math.abs(a)); // нельзя так потому что здесь выбор можем вернуть два значения, а не указывать реторн можем только если одно значение
    Predicate<Integer> pos = a -> a > 0;
    Consumer <Integer> print = a -> System.out.println(a);
    Consumer <Boolean> print2 = System.out ::println;

    UnaryOperator<Integer> abs2 = x -> x > 0 ? x : x * -1;


}
