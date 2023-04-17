package Class10HW;

public class Task6 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries, south america
        countries, europe countries, asian countries, african countries. Then
        print all values from that array using 2 different loops and calculate
        how many total countries been stored.
         */

        String[][] countries= {{"USA","Mexico","Canada"},
                {"El Salvador","Costa Rica","Brazil","Argentina","Colombia"},
                {"UK","Italy","France","Greece","Switzerland","Spain"},
                {"Japan","China","Thailand","Philippines","Indonesia"},
                {"Egypt","Ethiopia","South Africa","Nigeria"}
        };
        // First Loop

int sum=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j <countries[i].length ; j++) {

                System.out.print(countries[i][j] +" ");
               sum++;
            }
            System.out.println();
        }
        System.out.println("Total of countries is "+sum);
        // Second Loop
        System.out.println("----------------------------------------------------------------------");
int sum2=0;
        for (String[] country:countries) {
            for (String count : country) {
                System.out.print(count + " ");
                sum2++;
            }
            System.out.println();
        }
        System.out.println("Total of countries is "+sum2);
    }
}
