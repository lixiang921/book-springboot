package book.dao;

import book.pojo.Book;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author lixiang
 */
@Repository
public interface BookMapper extends Mapper<Book> {



    List<Book> getBookByName(String name);

    void updateBook(Book book);

    void deleteBook(Integer id);

    void addBook(Book book);
}
