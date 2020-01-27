import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        for (int i = 0; i < Test; i++) {
            int n = sc.nextInt();
            int nb = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + array[j];
            }
            if (sum == nb || sum < nb) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
