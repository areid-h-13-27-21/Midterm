import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Tester{


  public static void main(String[] args) throws FileNotFoundException {
      Scanner scanner = new Scanner(System.in);
      boolean cont = true;
      ArrayList<Tutors> currentTutors = listOfTutors("/Users/areid/Desktop/CS_SEMINAR/CS_SEMINAR/Midterm/Tutors.csv");
      while (cont) {
        // Create students
       System.out.print("Hi, welcome to peer tutoring, to be tutored please enter your name: ");
       String name = scanner.nextLine();
       System.out.print("Enter your class: ");
       String subject = scanner.nextLine();
       System.out.print("Enter your level: ");
       String level = scanner.nextLine();
       System.out.print("Enter your free block: ");
       String freeBlock = scanner.nextLine();
       Students student1 = new Students(name, subject, level, freeBlock);
       //assign student to tutor
       for (int i = 0; i <currentTutors.size(); i ++) {
           if(isQualified(student1, currentTutors.get(i))){
               currentTutors.get(i).addStudent(student1.getName());
               System.out.println("Yay, we found you a tutor");
               System.out.println("Tutor Name: " + currentTutors.get(i).getName());
               System.out.println("Current Students: " + currentTutors.get(i).getCurrentStudents());
               break;
  
           }
           if (i == currentTutors.size()-1) {
                System.out.println("Sorry, there is no available tutor for you right now");
           }
       }
       System.out.print("Would you like to add another student (yes/no): ");
       //stop adding students
       String keepGoing = scanner.nextLine();
       if (keepGoing.equals("no")) {
           cont = false;
       }
  
      }
  }


  public static ArrayList<Tutors> listOfTutors(String pathname) throws FileNotFoundException {
       ArrayList<Tutors> list = new ArrayList<Tutors>();
       File f = new File(pathname);
       Scanner sc = new Scanner(f);
       String[] header = sc.nextLine().split(",");


       while (sc.hasNextLine()) {
        //make new tutors using file
           ArrayList<String> line = new ArrayList<>(Arrays.asList(sc.nextLine().split(",")));
           String name = (line.get(0));
           String subject = (line.get(1));
           String level = (line.get(2));
           String freeBlock = (line.get(3));
           Tutors tutor1 = new Tutors (name,subject,level,freeBlock);
           list.add(tutor1);
       }

       return list;
     
  }
   public static boolean isQualified(Students student, Tutors tutor){
    //see if tutor and student have the same free block
      if(!student.getFreeBlock().equals(tutor.getFreeBlock())){
          return false;
      }


      int intTutorLevel = 1;
      int intStudentLevel = 1;
      int intTutorClass = 1;
      int intStudentClass = 1;
      String tutorLevel = tutor.getLevel();
      String studentLevel = student.getLevel();
      String tutorClass = tutor.getLevel();
      String studentClass = student.getLevel();


      //turn tutor level into int
      if(tutorLevel.equals("Honors")){
          intTutorLevel = 3;
      } if(tutorLevel.equals("Accelerated")){
          intTutorLevel = 2;
      }




      // turn student level into int
      if(studentLevel.equals("Honors")){
          intStudentLevel = 3;
      } if(studentLevel.equals("Accelerated")){
          intStudentLevel = 2;
      }



        //compare level
      if(intTutorLevel < intStudentLevel){
          return false;
      }
    
      //turning tutor class into int
      if(tutorClass.equals("Calc")){
          intTutorClass = 4;
      } if(tutorClass.equals("PreCalce")){
          intTutorClass = 3;
      } if(tutorClass.equals("Algebra")){
          intTutorClass = 2;
      }
      
      
      // turning student class into int
      if(studentClass.equals("Calc")){
          intStudentClass = 4;
      } if(studentClass.equals("PreCalc")){
          intStudentClass = 3;
      } if(studentClass.equals("Algebra")){
          intStudentClass = 2;
      }
      //compare classes
       if(intTutorClass < intStudentClass){
          return false;
      }




      return true;
  }
}
