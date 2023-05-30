package ch15.A3;

public class Main {
    public static void main(String[] args) {
        String title = "Welcome!";
        String message = "Hello, world!";
        //큰따옴표 3개 -> text block 텍스트 블럭 , %s로 바뀌는 부분 설정.
        String html = """
        <!DOCTYPE html>
        <html>
            <head>
                <title>%s</title>
            </head>
            <body>
                <h1 style="text-align: center">%s</h1>
            </body>
        </html>
        """.formatted(title, message); // formatted ->  인자 값 하나씩 채워줌 
        System.out.print(html);
    }
}
