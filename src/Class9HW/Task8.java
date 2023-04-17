package Class9HW;

public class Task8 {
    public static void main(String[] args) {
        /*
        Create an array to store char values and then print those in reverse order
         */

        char[] grade={'A','B','C','D','F'};
        for (int i = grade.length-1; i >=0; i--) {
            System.out.print(grade[i]+" ");
        }
    }
}
