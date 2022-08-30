import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int x: nums) {
            if (x % 2 == 0) {
                System.out.print(x);
            }
        }
        System.out.println("");
    // Задание 1

        Collections.sort(nums);
        Set<Integer> sets = new HashSet<>(nums);
        for (int x: sets) {
            if (x % 2 == 1) {
                System.out.print(x);
            }
        }
        System.out.println("");
    // Задание 2


        List<String> words = new ArrayList<>(List.of("xp", "kp", "vc", "as", "tl", "ac", "dc", "ac", "dc", "ac"));
        Set<String> wordSets = new HashSet<>(words);
        System.out.println(wordSets);
    // Задание 3

        Map<String, Integer> wordMaps = words.stream()
                .collect(Collectors.toMap(e -> e, e ->1, Integer :: sum));
        List<Integer> valueList = new ArrayList<>(wordMaps.values());
        for (int x: valueList) {
            if (x > 1) {
                System.out.print(x);
            }
        }
    // Задание 4
    }
}