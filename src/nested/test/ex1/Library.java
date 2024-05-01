package nested.test.ex1;

import java.util.Objects;

public class Library {

    private Book[] books;
    private int cnt;

    public Library(int maxCnt) {
        books = new Book[maxCnt];
    }

    public void addBook(String title, String author) {
        if (cnt >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[cnt++] = new Book(title, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        private Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
