// good. I've got a cool trick to find "between" that I like to show off (can't claim it's mine)
import java.util.Arrays;

public class ImmutableSort {
    public static void main(String[] args) {
        int[] a = {2, 1, 3};
        int largest = a[2];
        int between = a[1];
        int smallest = a[0];
        int temp1 = 0;
        int temp2 = 0;

        if(smallest > between) {
            temp1 = between;
            temp2 = smallest;
            between = temp2;
            smallest = temp1;
        }

        if(between > largest) {
            temp1 = largest;
            temp2 = between;
            largest = temp2;
            between = temp1;
        }
        if(smallest > largest) {
            temp1 = largest;
            temp2 = smallest;
            largest = temp2;
            smallest = temp1;
        }

        int[] sortedArray = new int[] {smallest, between, largest};

        System.out.println("original array: " + Arrays.toString(a));
        System.out.println("sorted array: " + Arrays.toString(sortedArray));

    }
}
