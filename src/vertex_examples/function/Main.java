package vertex_examples.function;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        Function<String, Integer> toInteger = string -> parse(string);
        Function<String, Integer> toInteger = Main::parse;
        Integer integer = toInteger.apply("5");
    }

    private static Integer parse(String s){
        return Integer.parseInt(s);
    }
}
