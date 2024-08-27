package porqueria;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            int number = array[i];
            if (number > max) {
                max = number;
            }
        }

        System.out.println(max);
    }
}





