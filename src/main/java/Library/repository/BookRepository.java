package Library.repository;

import Library.entity.Book;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BookRepository {
    private List<Book> bookList;
    public BookRepository(){
        this.bookList=new ArrayList<>();
        this.bookList.add(
                Book.builder()
                        .name("Władca Pierścieni: Drużyna Pierścienia")
                        .authorName("Tolkien John Ronald Reuel")
                        .iban("PL 60 3940 2030 0000 3940 0349 4444")
                        .build());
        this.bookList.add(
                Book.builder()
                        .name("Miecz przeznaczenia")
                        .authorName("Andrzej Sapkowski")
                        .iban("PL 60 3940 2030 0000 3940 0349 3500")
                        .build());
        this.bookList.add(
                Book.builder()
                        .name("Symfonia C++ Standard")
                        .authorName("Grębosz Jerzy")
                        .iban("PL 60 3940 2030 0000 3940 0349 1234")
                        .build());
    }
}
