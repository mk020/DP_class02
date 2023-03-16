package ch01.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {

  // private Book[] books; // 배열 선언
  private List<Book> books = new ArrayList<Book>();
  private int last = 0; // 마지막에 꽂힌 위치, 책 개수

  public BookShelf(int maxsize) {
    // 배열 생성
    // this.books = new Book[maxsize];
  }

  // 책 꽂는 메소드
  public void appendBook(Book book) {
    // books[last] = book;
    books.add(book);
    last++;
  }

  // 책 가져오는 메소드
  // public Book getBookAt(int index) {
  public Book getBookFrom(int index) {
    return books[index];
  }

  // 책 개수를 반환하는 메소드
  public int getLength() {
    return last;
  }

  // 자신의 iterator를 반환하는 메소드
  @Override
  // public BookShelfIterator iterator() {
  public Iterator<Book> iterator() {
    return new BookShelfIterator(this);
    // return new BookShelfIteratorBackward(this);
  }

}
