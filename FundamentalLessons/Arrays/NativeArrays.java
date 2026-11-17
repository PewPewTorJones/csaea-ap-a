package FundamentalLessons.Arrays;

import java.util.Arrays;

/**
 * Native Arrays in Java: Code-Along Demo
 * Topics: declaring, default values, indexes, length, out-of-bounds,
 * parts of a for loop, enhanced for, skipping ahead, going backward.
 */

public class NativeArrays {

        public static void main(String[] args) {

            int[] scores1 = new int[5];

            System.out.println("Default values: " + Arrays.toString(scores1));

            int[] nums = {3, 7, 1, 9, 4};

            System.out.println("Initializer list: " + Arrays.toString(nums));

            String[] names = new String[3];
            boolean[] flags = new boolean[3];
            double[] prices = new double[3];

            System.out.println("String defaults:  " + Arrays.toString(names));
            System.out.println("boolean defaults: " + Arrays.toString(flags));
            System.out.println("double defaults:  " + Arrays.toString(prices));

            // ===== 2. INDEXES AND LENGTH =====

                    // Indexes start at 0. The last index is length - 1.
            System.out.println("\nFirst element nums[0]: " + nums[0]);
            System.out.println("Length (a field, no parentheses): " + nums.length);
            System.out.println("Last element nums[nums.length - 1]: " + nums[nums.length - 1]);

            nums[2] = 6;
            // ===== 3. OUT OF BOUNDS =====
            //System.out.println(nums[5]);
            //System.out.println(nums[-1]);
             
            
            
            // ===== 4. PARTS OF A FOR LOOP =====
            //   for (initialization; condition; update)
            //   initialization -> runs once, sets the starting index
            //   condition      -> checked before every pass; loop stops when false
            //   update         -> runs after every pass

            for (int i = 0; i < nums.length; i++) {
                System.out.println(" Index " + i + " -> value " + nums[i]);
            }

            // ===== 5. ENHANCED FOR LOOP =====
            // Gives you each VALUE, no index. Good for reading, not for changing.

            for (int value : nums) {
                System.out.println("enhanced value: " + value);
            }
        // Challenge 1: Double It
        // Multiply every element by 2, then print the array.
        int[] challengeOne = {3, 7, 1, 9, 4};
        //TODO: your loop here

        for (int i = 0; i < challengeOne.length; i++) {
            challengeOne[i] = challengeOne[i] * 2;
            System.out.println(challengeOne[i]);
        }
         // Challenge 2: Every Other
        // Use i += 2 to add 10 to only the elements at even indexes, then print.
        int[] challengeTwo = {3, 7, 1, 9, 4};
        // TODO: your loop here

        for (int i = 0; i < challengeTwo.length; i += 2) {
            challengeTwo[i] += 10;
            System.out.println(challengeTwo[i]);
        }
        // Challenge 3: Replace Negatives
        // Change every negative number to 0, then print.
        int[] temps = {5, -3, 8, -1, 0, -7};
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < 0) {
                temps[i] = 0;
            }
            System.out.println(temps[i]);
        }
        // Challenge: Curve the Scores
        // int[] scores = {85, 62, 97, 45, 70, 99};
        // Add 5 to every score, but no score can go above 100. 
        int [] scores = {85, 62, 97, 45, 70, 99};
        for (int i = 0; i < scores.length; i++) {
            scores[i] += 5;
            if (scores[i] > 100) {
                scores[i] = 100;
            }
            System.out.println(scores[i]);
        }
        // Challenge: Find the Highest
        // int[] temps = {58, 71, 64, 80, 77, 69};
        // Use a loop to find the highest temperature and the index it's at, then print both. Use Math.max()!
        int[] temps2 = {58, 71, 64, 80, 77, 69};
        int highestTemp = temps2[0];
        int highestIndex = 0;
        for (int i = 0; i < temps2.length; i++) {
            if (temps2[i] > highestTemp) {
                highestIndex = i;
            }
            highestTemp = Math.max(highestTemp, temps2[i]);
        }
        System.out.println("Highest temperature: " + highestTemp);
        System.out.println("Index: " + highestIndex);
    }
}