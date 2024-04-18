package classe.src.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Python ", "JavaScript ");
        langs.forEach(print);

        System.out.println();

        String[] maisLangs = {"C# ", "Perl ", "Go "};
        Stream.of(maisLangs).forEach(print);

        System.out.println();
        Arrays.stream(maisLangs).forEach(print);
        System.out.println();
        Arrays.stream(maisLangs, 1, 2).forEach(print);

        List<String> outrasLangs = Arrays.asList("PHP ", "C ", "Kotlin ");
        outrasLangs.stream().forEach(print);
        System.out.println();
        outrasLangs.parallelStream().forEach(print);
    }
}
