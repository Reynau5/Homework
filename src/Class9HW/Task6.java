package Class9HW;

public class Task6 {
    public static void main(String[] args) {
        /*
        Create an array on integers and calculate the sum of all elements in an array
         */
        int[] numbers={5,10,15,20,30,110};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum=numbers[i]+sum;
        }
        System.out.println("The total is "+sum);
    }
}
