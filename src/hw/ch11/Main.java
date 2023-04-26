package hw.ch11;

public class Main {
  public static void main(String[] args) {
    System.out.println("20210787 유민경");
    
    Directory MyDocuments = new Directory("MyDocuments", "20230401", "MinKyeongYu");
    Directory MyData = new Directory("MyData", "20230401", "MinKyeongYu");
    Directory MyPictures = new Directory("MyPictures", "20230401", "MinKyeongYu");

    MyDocuments.add(new File("유민경0.doc", "20230501", 1000, "MinKyeongYu"));
    MyDocuments.add(MyData);
    
    MyData.add(new File("유민경1.doc", "20230501", 2000, "MinKyeongYu"));
    MyData.add(new File("유민경2.java", "20230501", 3000, "MinKyeongYu"));
    MyData.add(MyPictures);

    MyPictures.add(new File("유민경3.gif", "20230601", 4000, "MinKyeongYu"));
    MyPictures.add(new File("유민경4.jpg", "20230601", 5000, "MinKyeongYu"));
    MyPictures.add(new File("유민경5.png", "20230601", 6000, "MinKyeongYu"));

    MyDocuments.printList();
  }
}
