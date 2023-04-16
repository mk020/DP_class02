package hw.ch10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("학번: 20210787, 이름: 유민경\n");
  
    Student s1 = new Student("최승훈", "20211111", 171);
    Student s2 = new Student("유민경", "20210787", 168);
    Student s3 = new Student("김희윤", "20213333", 173);
    Student s4 = new Student("고예진", "20214444", 174);
    Student s5 = new Student("노승아", "20215555", 175);

    List<Student> StudentList = Arrays.asList(s1,s2,s3,s4,s5);

    System.out.println("** (1) 정렬 결과 (오름차순)");
    StudentList.sort(new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o1.compareTo(o2);
      }
    });
    System.out.println(StudentList);

    System.out.println();

    System.out.println("** (2) 정렬 결과 (내림차순)");
    StudentList.sort(new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o2.compareTo(o1);
      }
    });
    System.out.println(StudentList);
  }
}
