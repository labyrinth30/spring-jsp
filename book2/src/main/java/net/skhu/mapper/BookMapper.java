package net.skhu.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Book;
@Mapper
public interface BookMapper {
	@Select("""
			SELECT b.id,b.title,b.author,b.price, c.name "categoryName"
			FROM book b, category c
			WHERE b.categoryId = c.id; """)
	List<Book> findAll();
	@Select("""
			SELECT b.*, c.id categoryName
			FROM book b LEFT JOIN category c ON b.categoryId = c.id
			WHERE b.id = #{id} """)
	Book findById(int id);
}