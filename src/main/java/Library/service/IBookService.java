package Library.service;

import Library.entity.Book;

import java.util.List;

public interface IBookService {
    public List<Book> getBook(Book book);
}
