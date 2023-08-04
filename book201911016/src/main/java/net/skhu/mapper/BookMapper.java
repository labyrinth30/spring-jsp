package net.skhu.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Book;
@Mapper
public interface BookMapper {
	@Select("""
			SELECT b.*, c.categoryName
			FROM Book b JOIN category c ON b.categoryId = c.id """)
	List<Book> findAll();
	@Select("""
			SELECT b.*, c.categoryName
			FROM Book b JOIN category c ON b.categoryId = c.id
			WHERE title LIKE #{title} """)
	List<Book> findByTitle(String title);
	@Select("""
			SELECT b.*, c.categoryName
			FROM Book b JOIN category c ON b.categoryId = c.id
			 WHERE b.id = #{id} """)
			 Book findById(int id);
}
