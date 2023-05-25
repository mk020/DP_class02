package ch15.Sample;

import ch15.Sample.pagemaker.PageMaker;

public class Main {
    public static void main(String[] args) {
        // Facade를 이용함
        PageMaker.makeWelcomePage("hyuki@example.com", "welcome.html");
        PageMaker.makeWelcomePage("mk02081@naver.com", "welcome2.html");
        // 클래스의 메소드(static)
    }
}
