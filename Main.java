import java.util.Scanner;
import java.util.Arrays;

public class Main
{
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
        int length = 4;
        int[] array = new int[length];
        
        for (int x = 0; x < length; x++) {
            System.out.printf("Input a number: ");
         array[x] = in.nextInt();
        }
        in.close();
        
        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        System.out.println("min value: " + minValue);
        System.out.println("min index: " + minIndex);

 }
}