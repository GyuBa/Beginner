package mapper;

import domain.ReviewDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewMapper {
    @Select(value = "select * from review")
    public List<ReviewDTO> getValue();

    @Select(value = "select * from review where id = #{id}")
    public List<ReviewDTO> getValue(int id);

    @Insert(value = "insert into review (astro_title, title, value, user_name) values(#{astro_title}, #{title}, #{value}, #{user_name}")
    public void setValue(ReviewDTO reviewDTO);
}
