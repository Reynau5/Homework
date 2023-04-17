package Class9HW;

public class Task7 {
    public static void main(String[] args) {
        /*
        From an array of integer elements find the largest number.
         */
        int[] counter={20,80,60,30,10};
        int largest=0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > largest) {
                largest = counter[i];
            }
        }
                System.out.println("The largest number is "+largest);


    }
}
