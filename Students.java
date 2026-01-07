public class Students{
  public String name;
  public String studentClass;
  public String level;
  public String freeBlock;




  public Students(String name, String studentClass, String level, String freeBlock) {
      this.name = name;
      this.studentClass = studentClass;
      this.level = level;
      this.freeBlock = freeBlock;
  }




  public String getName() {
      return name;
  }




  public String getFreeBlock(){
      return freeBlock;
  }
  public String getStudentClass() {
      return studentClass;
  }




  public String getLevel() {
      return level;
  }
}

