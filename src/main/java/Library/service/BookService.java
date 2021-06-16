package Library.service;

import Library.entity.Book;
import Library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService implements IBookService{
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getBook(Book book) {
        List<Book> bookList = new ArrayList<>();
        if(book.getIban()!=null){
            for(Book b:this.bookRepository.getBookList()){
                if(b.getIban().equals(b.getIban()))bookList.add(b);
            }
        }
        if(book.getName()!=null){
            for(Book b:bookList){
                if(!b.getName().contains(book.getName())){
                    bookList.remove(b);
                }
            }
        }

        return bookList;
    }
}
