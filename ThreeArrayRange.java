// I like the logic here a lot; nice work
public class ThreeArrayRange {
    public static void main(String[] args) {
        
        int[] a = {13, 13, 13};
        int largest = a[0];
        int smallest = a[0];

        if(largest < a[1]) {
            largest = a[1];
        }
        if(smallest > a[1]) {
            smallest = a[1];
        }
        if(largest < a[2]) {
            largest = a[2];
        }
        if(smallest > a[2]) {
            smallest = a[2];
        }
        System.out.println(largest - smallest);

    }
}
