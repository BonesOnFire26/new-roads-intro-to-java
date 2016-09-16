import java.util.Scanner;

public class ComputeGrade{

 public static void main(String[] args){
 
   //Setup scanner
   Scanner input = new Scanner(System.in);
   
   System.out.println("Student's name: ");
   
   String name = input.next();
   
   System.out.println("Enter grade for test 1:");
   
   double grade1 = input.nextDouble();

   
   System.out.println("Enter grade for test 2:");
   
   double grade2 = input.nextDouble();
   
   System.out.println("Enter grade for test 3:");
   
   double grade3 = input.nextDouble();
   
   double average = (grade1 + grade2 + grade3) / 3;
   
   String finalGrade = name + "'s final grade is ";
   
   if(average >=90){
     finalGrade = finalGrade + 'A';
    
   }
 else if(average < 90 && average >= 80){
   finalGrade += 'B';
   
 }
 else if(average <80 && average >= 70){
   finalGrade += 'C';
   
 }
   else if (average < 70 && average >= 60){
     finalGrade += 'D';
   }
   else{
     finalGrade += 'F';
   }
   
   System.out.println( finalGrade);
 }
}