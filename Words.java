import java.util.HashMap;
import java.util.HashSet;

public class Words {
    public static void main(String[] args) {
        String[] array = {"яблоко", "груша", "слива", "яблоко", "банан", "яблоко", "апельсин", "мандарин", "киви", "банан"};


        HashSet<String> words = new HashSet<String>();
        for (String word : array) {
            words.add(word);
        }

        System.out.print("Список уникальных слов массива: ");
        for (String word : words) {
            System.out.print(word + " ");
        }

        HashMap<String, Integer> countWords = new HashMap<>();
        for (String word : array) {
            if (countWords.containsKey(word)) {
                countWords.put(word, countWords.get(word) + 1);
            } else {
                countWords.put(word, 1);
            }
        }
        System.out.println();
        System.out.print("Колличество каждого слова в массиве");
        System.out.println();
        for (String word : countWords.keySet()) {
            System.out.println(word + ": " + countWords.get(word));
        }

    }
}

