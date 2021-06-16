package Library.controller;

import Library.entity.Book;
import Library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public List<Book> getBook(@RequestBody Book book){
        return this.bookService.getBook(book);
    }
}
