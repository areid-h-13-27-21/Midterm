
import java.util.*;


public class Tutors {
   // private instance variables
   public String name;
   public String subject;
   public String level;
   public String freeBlock;
   public ArrayList<String> currentStudents;


   // constructor
   public Tutors(String name, String subject, String level, String freeBlock) {
       this.name = name;
       this.subject = subject;
       this.level = level;
       this.freeBlock = freeBlock;
       currentStudents = new ArrayList<String>();
   }


   // get name
   public String getName() {
       return name;
   }

   // get subject
   public String getSubject() {
       return subject;
   }

   // get level
   public String getLevel() {
       return level;
   }

   // get freeBlock
   public String getFreeBlock() {
       return freeBlock;
   }

   // get currentStudents
   public ArrayList<String> getCurrentStudents() {
       return currentStudents;
   }

   // set currentStudents
   public void setCurrentStudents(ArrayList<String> currentStudents) {
       this.currentStudents = currentStudents;
   }

   // method that adds student to tutors list
   public void addStudent (String studentName) {
       currentStudents.add(studentName);
   }
}
