package studentapp;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
                                                                                 
        System.out.println("Enter number of new students to enroll:");           //Ask how many students you want to add
        Scanner in = new Scanner(System.in);

        int numOfStudents = in.nextInt();
    
        Student[] student = new Student[numOfStudents];                            //Creating array of objects , array of type Student
    
        for(int i=0;i<numOfStudents;i++)                                           //Create n number of new students
        {
         student[i]= new Student();
         student[i].enroll();
         student[i].setStudentId();
         student[i].payTution();
         student[i].showStatus();
        }
        
        for(int j=0;j<numOfStudents;j++)
        {
            System.out.println(student[j].toString());
        }
    }
}
