import java.util.Scanner;

public class StudentDatabase {

    public static void main(String[] args){

        System.out.println("Enter number of new students to enroll : ");
        Scanner input = new Scanner(System.in);
        int noOfStudents = input.nextInt();
        Student[] students = new Student[noOfStudents];

        for(int i=0;i<noOfStudents;i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();

        }

        for(int i=0;i<noOfStudents;i++){
            System.out.println(students[i].toString());
        }
    }
}
