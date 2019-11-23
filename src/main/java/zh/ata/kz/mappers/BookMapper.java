package zh.ata.kz.mappers;

import org.apache.ibatis.annotations.*;
import zh.ata.kz.model.Book;
import zh.ata.kz.model.Lorc;

import java.util.List;

/**
 * Created by j_igo on 05.11.2019.
 */
public interface BookMapper {
    @Insert("INSERT INTO book(bookTitle,bookAuthor,bookPrice) VALUES(#{bookTitle},#{bookAuthor},#{bookPrice})")
    @Options(useGeneratedKeys = true, keyProperty = "id", flushCache = true, keyColumn = "id" )
    public void addBook(Book book);

   // @Select("SELECT BOOKTITLE as bookTitle, BOOKAUTHOR as bookAuthor, BOOKPRICE as bookPrice FROM book WHERE"
   //         +" BOOKAUTHOR = #{bookAuthor}")
   // public Book getBookByAuthor(String author);

  // @Select("SELECT BOOKTITLE as bookTitle, BOOKAUTHOR as bookAuthor, BOOKPRICE as bookPrice FROM book WHERE"
  //         +" BOOKTITLE = #{bookTitle}")
  // public Book getBookByTtitle(String title);

    @Select("SELECT BOOKTITLE as bookTitle, BOOKAUTHOR as bookAuthor, BOOKPRICE as bookPrice FROM book WHERE"
            +" ID = #{id}")
    public Book getBookById(int id);

    @Select("SELECT * FROM book")
    public List<Book> listBooks();

    @Update("UPDATE book SET BOOKTITLE = #{bookTitle}, BOOKAUTHOR = #{bookAuthor}, BOOKPRICE = #{bookPrice}"
        +"WHERE ID = #{id} ")
    public void updateBook(Book book);

    @Delete("DELETE FROM book WHERE ID = #{id}")
    public void removeBook(int id);

    @Select("select course.course_id,title,dept_name,credits,prereq_id from prereq" +
            " right outer join course on prereq.course_id = course.course_id")
    
//@Select("select prereq.course_id, title,dept_name,credits,prereq_id from prereq"
//       +" left outer join course on prereq.course_id = course.course_id")
    public List<Lorc> getJoin();
}

