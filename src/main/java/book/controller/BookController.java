package book.controller;

import book.dao.BookMapper;
import book.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookMapper bookMapper;

    @GetMapping("/getBook")
    public List<Book> getBook() {
        Example example = new Example(Book.class);
        Example.Criteria criteria = example.createCriteria();
        List<Book> books = bookMapper.selectByExample(example);
        return books;
    }

    @GetMapping("/bookByName")
    public List<Book> getBookByName(String name){
        List<Book> books = bookMapper.getBookByName(name);
        return books;
    }

    @PostMapping("/updateBook")
    public void updateBook(@RequestBody Book book) {
        bookMapper.updateBook(book);
    }

    @DeleteMapping("/deleteBook/{id}")
    public void deleteBook(@PathVariable(name = "id") Integer id) {
        bookMapper.deleteBook(id);
    }

    @PostMapping("/insertBook")
    public void addBook(@RequestBody Book book) {
        System.out.println(book);
        bookMapper.addBook(book);
    }
}
