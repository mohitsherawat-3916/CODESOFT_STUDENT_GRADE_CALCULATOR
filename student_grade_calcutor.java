import java.util.*;
public class student_grade_calcutor {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of subject ");
        int n= sc.nextInt();
        int[] marks=new int[n];
        int total=0;
        for(int i=0; i<n; i++){
        System.out.print("Enter marks for subject " + (i + 1) + " (0 to 100) : ");
        marks[i]=sc.nextInt();
         total=marks[i]+total;
        }
        System.out.println("total number : "+total);
        double average=total/n;
        System.out.println("percentage : " + average);
        char Grade;
        if (average>=85){
            Grade ='A';
        } else if ( average>=75){
            Grade='B';
        } else if ( average>=60){
            Grade='C';
        } else if ( average>=35){
            Grade='D';
        } else {
            Grade='F';
            System.out.println("FAILED");;
        }
        System.out.println("Grade : "+Grade);


    }
}
