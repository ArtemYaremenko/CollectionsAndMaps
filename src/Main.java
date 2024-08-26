import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        //task1
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        //task2
        Collections.sort(nums);
        int unique = 999999999;
        for (int num : nums) {
            if (num % 2 == 0 && num != unique) {
                unique = num;
                System.out.println(unique);
            }
        }

        //task3
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);

        //task4
        for (String s : strings) {
            int occurrences = Collections.frequency(strings, s);
            System.out.println(occurrences);
        }
    }
}