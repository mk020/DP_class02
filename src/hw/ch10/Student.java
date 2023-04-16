package hw.ch10;

public class Student implements Comparable<Student> {

  private String name="";
  private String id="";
  private int height=0;

  public Student(String name, String id, int height) {
    this.name = name;
    this.id = id;
    this.height = height;
  }

  public int compareTo(Student s) {
    if (this.height<s.height) {
      return -1;
    }
    else if (this.height==s.height) {
      return 0;
    }
    else return 1;
  }

  public String toString() {
    return ("(이름: "+name+", "+"키: "+height+")");
  }
  
}
