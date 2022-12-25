package module10;
import java.io.*;
import java.util.*;

public class WordFreqCounter {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> hashMap;
        try (BufferedReader br = new BufferedReader
                (new FileReader("/Users/mac/Desktop/Java/HelloWorld/src/module10/words.txt"))) {
            String[] words;
            hashMap = new HashMap<>();

            String line = br.readLine();
            while (line != null) {
                words = line.split(" ");
                for (String word : words) {
                    hashMap.merge(word, 1, Integer::sum);
                }
                line = br.readLine();
            }
        }
            System.out.println(hashMap);
        }
    }


