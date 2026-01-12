
public class Students{
  public String name;
  public String studentClass;
  public String level;
  public String freeBlock;

//This class is used to make a student, there is a constructor and getting methods for all of the instance variables which will be used in the tester class 

//Student constructor
  public Students(String name, String studentClass, String level, String freeBlock) {
      this.name = name;
      this.studentClass = studentClass;
      this.level = level;
      this.freeBlock = freeBlock;
  }



//get name
  public String getName() {
      return name;
  }

//get free block
  public String getFreeBlock(){
      return freeBlock;
  }

  //get class
  public String getStudentClass() {
      return studentClass;
  }

//get level
  public String getLevel() {
      return level;
  }
}

