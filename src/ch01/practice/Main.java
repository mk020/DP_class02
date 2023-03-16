package ch01.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // 책 생성
    Book b1 = new Book("book1");
    // System.out.println(b1.getName());

    Book b2 = new Book("book2");

    // 책꽂이 생성
    BookShelf bs1 = new BookShelf(10);
    bs1.appendBook(b1);
    bs1.appendBook(b2);

    Book result = bs1.getBookFrom(0);
    // System.out.println(result.getName());

    Book result2 = bs1.getBookFrom(1);
    // System.out.println(result2.getName());

    // for루프를 이용해서 책이름 출력하기
    for (int i = 0; i < bs1.getLength(); i++) {
      System.out.println(bs1.getBookFrom(i).getName());
    }

    // 확장 for문을 이용하기
    System.out.println("확장 for문 사용");
    for (Book b : bs1) {
      System.out.println(b.getName());
    }

    // iterator 패턴을 이용해서 책이름 출력하기

    // 1: 집합체(책꽂이)로부터 iterator 얻어오기
    // BookShelfIterator iterator = bs1.iterator();
    Iterator<Book> iterator = bs1.iterator();

    // 2: iterator 통해서 원소(책) 얻어오기
    while (iterator.hasNext()) {
      System.out.println(iterator.next().getName());
    }

    // 문자열 리스트 만들어 출력해보기
    // 자바 컬렉션: List, Set, Map
    List<String> slist = new ArrayList<String>();
    slist.add("a");
    slist.add("b");
    slist.add("c");

    // 1. for 루프 이용하기
    for (int i = 0; i < slist.size(); i++) {
      System.out.println(slist.get(i));
    }

    // 2. 확장 for 루프 이용하기
    for (String s : slist) {
      System.out.println(s);
    }

    // 3. iterator 이용하기
    // 3.1 iterator 얻기
    Iterator<String> it = slist.iterator();

    // 3.2 iterator 이용해서 원소 얻기
    while (it.hasNext()) {
      System.out.println(it.next());
    }

    // 4. 스트림 이용하기
    slist.stream().forEach(System.out::println);
  }
}
