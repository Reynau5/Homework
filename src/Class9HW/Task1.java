package Class9HW;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create an array of chars and store grades into it: A,B,C,D.
        Then print a grade B (use 2 different ways of creating an array).
         */

        // First Loop

        char[] grades={'A','B','C','D'};
        System.out.println(grades[1]);

        System.out.println("--------------------------------");

        char[] grades2=new char[4];
        grades2[0]='A';
        grades2[1]='B';
        grades2[2]='C';
        grades2[3]='D';
        System.out.println(grades2[1]);
    }
}
