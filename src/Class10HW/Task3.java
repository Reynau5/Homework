package Class10HW;

public class Task3 {
    public static void main(String[] args) {
        /*
            Using 2D array create a grocery list.
            Inside you should have an array of veggies, fruits, dairy and sweets.
            Retrieve all values from that array using 2 different loops
         */

        String[][] grocery={{"Green Beans","Carrots","Broccoli","Corn"}, // veggies
                {"Mango","Banana","Pineapple","Blueberry"}, // fruits
                {"Milk","Cheese","Yogurt","Butter"}, //dairy
                {"Cake","juice","Cookies","Ice Cream"} //sweets
        };

        // First Loop

        for(String[] food:grocery){
            for(String items:food){
                System.out.print(items+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");

        // Second Loop

        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
            System.out.println();
        }
    }
}
