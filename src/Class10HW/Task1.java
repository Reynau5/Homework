package Class10HW;

public class Task1 {
    public static void main(String[] args) {

        /*
        Create a 2D array(shorter way) in which first array will consist of 4 names and
        second array will contain grades. Then your program should print name of the students
        that has A and B grade
         */

        String[][] studentGrade={{"Adrian","Ellie","Reyna","Scarlett"},
                {"A","B","C","D"}
        };

        for (int i = 0; i <studentGrade[0].length ; i++) {
            for (int j = 0; j < 1 ; j++) {
                if (studentGrade[1][i].equals("A") || studentGrade[1][i].equals("B")) {


                    System.out.println(studentGrade[0][i] + " Grade is " + studentGrade[1][i]);
                }
            }
        }

    }
}
