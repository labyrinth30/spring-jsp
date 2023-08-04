package net.skhu.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Course;
@Mapper
public interface CourseMapper {
	@Select("""
			SELECT c.id,c.year,c.semester,c.gubun,c.code,c.title,f.name,c.sigan
			FROM course c LEFT JOIN professor f ON c.professorId = f.id""")
	List<Course> findAll();
	@Select("""
			SELECT c.id,c.year,c.semester,c.gubun,c.code,c.title,f.name,c.sigan
			FROM course c LEFT JOIN professor f ON c.professorId = f.id
			WHERE c.title LIKE #{title} """)
	List<Course> findByTitle(String title);
	@Select("""
			 SELECT c.id,c.year,c.semester,c.gubun,c.code,c.title,f.name,c.sigan
			FROM course c LEFT JOIN professor f ON c.professorId = f.id
			WHERE c.id LIKE #{id} """)
	Course findById(int id);

}