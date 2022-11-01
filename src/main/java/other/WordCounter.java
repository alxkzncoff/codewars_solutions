package other;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) throws FileNotFoundException {
        WordCounter counter = new WordCounter();
        System.out.println(counter.count(args[0]));
    }

    private int count(String word) throws FileNotFoundException {
        int rsl = 0;
        List<String> words = new ArrayList<>();
        try (var scanner = new Scanner(new File("text.txt"))) {
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
        }
        for (String w: words) {
            if (w.equals(word)) {
                rsl++;
            }
        }
        return rsl;
    }
}
