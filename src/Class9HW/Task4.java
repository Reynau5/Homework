package Class9HW;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create an array of cars and store 6 elements into it. Using
        2 different loops print all values from the array.
         */

        // First Loop

        String[] cars={"BMW","Mercedes","Jeep","Toyota","Honda","GMC"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+" ");
        }
        // Second Loop
        System.out.println();
        System.out.println("--------------------------------------");
        for(String car:cars){
            System.out.print(car+" ");
        }

    }
}
