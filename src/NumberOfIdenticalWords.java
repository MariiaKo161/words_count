import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class NumberOfIdenticalWords     {
    private static String[] wordsCount;


    static void printWordsCount(String words) {
        wordsCount = words.toUpperCase(Locale.ROOT).split("\\s*(\\s|,|!|\\.|\\?|\\(|\\)|'|:|;|\\{|}|>|<" +
                "|=|\\+|\\*|/|\"|\\||.?\\d+.?|#|«|»|.?_.?|]|\\[|&|@|-.?|©|\\\\|—)\\s*");
        Arrays.stream(wordsCount)
                .filter(w -> !w.isEmpty())
                .collect(Collectors.groupingBy(w -> w))
                .forEach((k, v) -> System.out.println(k + " - " + v.size()));
    }
}
