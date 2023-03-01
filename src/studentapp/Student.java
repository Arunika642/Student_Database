package studentapp;
import java.util.Scanner;
public class Student {
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tutionbalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    Student(){                                                //Constructor: prompts user to enter student's name,year
        Scanner in = new Scanner(System.in);

        System.out.println("Enter student firstname");
        this.firstname = in.nextLine();

        System.out.println("Enter student lastname");
        this.lastname = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class grade: ");
        this.gradeYear = in.nextInt();

    }

    void setStudentId() {                                                           //Generate an id
                                                                                    
        id++;                                                                       //increment of id with each student
        this.studentID = gradeYear + "" + id;                                      //Grade level + ID

    }
    public void enroll(){                                                          //Enroll in courses
        
        do {
        System.out.print("Enter course name to enroll (Q to quit): ");

        Scanner in = new Scanner(System.in);
        String course = in.nextLine();

        if(!course.equals("Q")){
            courses = courses + "" + course;
            tutionbalance = tutionbalance + costOfCourse;
        }
        else{
            break;
        }
    } while(1!=0);

       System.out.println("TUTION BALANCE: " + tutionbalance);
    }

    public void payTution()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you want to pay: ");

        int payment = input.nextInt();
        tutionbalance = tutionbalance - payment;

        System.out.println("Thank you for yor payment of $" + payment);

    }

    public void showStatus()                                              //show status
    {
    System.out.println("Name: "+firstname + " " + lastname + "\nGrade Year: " + gradeYear + "\nStudent ID: " + studentID + "\nENROLLED IN: " + courses +  "\nYour balance is: $"+tutionbalance);
    }
     
}

    
