package vertex_examples.function_composition;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        Function<String, String> trim = s -> s.trim();
        Function<String, String> trim = String::trim;
        String str = trim
                .andThen(String::toLowerCase)
                .andThen(StringBuilder::new)
                .andThen(StringBuilder::reverse)
                .andThen(StringBuilder::toString)
                .apply("ABCDEFG");

        System.out.println(str);
    }
}
