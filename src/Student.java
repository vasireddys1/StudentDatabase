import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int year;
    private String studentID=null;
    private String courses=null;
    private int tuitionBalance=0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor for student

    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student First Name: ");
        this.firstName = input.nextLine();
        System.out.println("Enter Student Last Name: ");
        this.lastName = input.nextLine();
        System.out.println("Enter Student Grade Year: \n1-Freshman\n2-Sophmore\n3-Junior\n4-Senior");
        this.year = input.nextInt();

        setStudentID();
    }

    //Generate a Student ID
    public void setStudentID(){
        id++;
        this.studentID = year+""+id;
    }

    //Student Enroll in courses

    public void enroll(){
        do{
            System.out.print("Enter Courses to Enroll (Q to Quit) ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();
            if(!course.equals("Q")){
                courses = courses+"\n "+course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else{
                break;
            }
        }while (1!=0);
    }

    public void viewBalance(){
        System.out.println("Tuition Balance to be paid: $"+tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment: ");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for payment of $"+payment);
        viewBalance();
    }

    public String toString(){
        return "Name: "+firstName+" "+lastName+"\nGrade Level: "+year+"\nStudent ID: "+studentID+"\nCourses Enrolled:"+courses+"\nBalance: $"+tuitionBalance;
    }
}
