import java.util.Scanner;
import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];

        System.out.println("Enter ten integers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }

        // Eliminate duplicates and print distinct integers
        System.out.print("The distinct integers are: ");
        for (int value : eliminateDuplicates(list)) {
            System.out.print(value + " ");
        }
        input.close();
    }

    public static int[] eliminateDuplicates(int[] list) {
        HashSet<Integer> set = new HashSet<>();
        for (int value : list) {
            set.add(value);
        }

        // Convert HashSet to int array and return
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}