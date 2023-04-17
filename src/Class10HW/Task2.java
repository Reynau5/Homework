package Class10HW;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create 2D array of cars : american, german, korean, italian. Then retrieve all
        values from that array using 2 different loops
         */

// First Loop
        String[][] cars={{"american","german","korean","italian"},
                          {"GMC","BMW","Kia","Ferrari"}};
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {

                System.out.print(cars[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");

// Second Loop
        for (String[] car:cars){
            for(String brand:car){
                System.out.print(brand+" ");
            }
            System.out.println();
        }


    }
}
