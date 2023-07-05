
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramSearch {
    public static void main(String[] args) {
        String word = "legoog";
        List<String> candidates = Arrays.asList("google", "enlists", "inlets", "banana");

        List<String> anagrams = findAnagrams(word, candidates);
        System.out.println(anagrams);
    }

    public static List<String> findAnagrams(String word, List<String> candidates) {
        List<String> anagrams = new ArrayList<>();

        char[] sortedWord = word.toCharArray();
        Arrays.sort(sortedWord);

        for (String candidate : candidates) {
            char[] sortedCandidate = candidate.toCharArray();
            Arrays.sort(sortedCandidate);

            if (Arrays.equals(sortedWord, sortedCandidate)) {
                anagrams.add(candidate);
            }
        }

        return anagrams;
    }
}

/*
* ТЕСТЫ
* word1 - "milk"
* word2 - "cavabanga"
* word3 - "word"
*
* candidates1 - "link","kilm","kilmonger","word"
* candidates2 - "bangacaca","bangacava","nananahahahqwe","jokes"
* candidates3 - "lord","gods","dorw","pikmik"
* */

