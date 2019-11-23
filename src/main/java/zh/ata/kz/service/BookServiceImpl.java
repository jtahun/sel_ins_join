package zh.ata.kz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import zh.ata.kz.mappers.BookMapper;
import zh.ata.kz.model.Book;
import zh.ata.kz.model.Lorc;

import java.util.List;

/**
 * Created by j_igo on 05.11.2019.
 */
@Service("BookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    @Transactional
    public void addBook(Book book){bookMapper.addBook(book);}

    @Override
    @Transactional
    public void removeBook(int id){bookMapper.removeBook(id);}

    @Override
    @Transactional
    public Book getBookById(int id){return bookMapper.getBookById(id);}

    @Override
    @Transactional
    public void updateBook(Book book){bookMapper.updateBook(book);}


    @Override
    @Transactional
    public List<Book> listBooks(){return bookMapper.listBooks();}

    @Override
    @Transactional
    public List<Lorc> getJoin(){return bookMapper.getJoin();}

}
