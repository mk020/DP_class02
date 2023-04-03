package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("20210787 유민경");

        FileIO f = new FileProperties(); // 어댑터 생성
        try {
            f.readFromFile("file.txt");

            f.setValue("Year", "2023");
            f.setValue("bornYear", "2002");
            f.setValue("StudentId", "20210787");
            f.setValue("Name", "YuMinKyeong");
            f.setValue("Location", "Seoul");
            
            f.writeToFile("YuMinKyeong.txt");
            System.out.println("YuMinKyeong.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
