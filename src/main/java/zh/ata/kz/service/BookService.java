package zh.ata.kz.service;

import java.util.List;
import zh.ata.kz.model.Book;
import zh.ata.kz.model.Lorc;

/**
 * Created by j_igo on 05.11.2019.
 */
public interface BookService {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();

    public List<Lorc> getJoin();
}
