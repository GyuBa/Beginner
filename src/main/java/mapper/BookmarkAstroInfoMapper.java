package mapper;

import domain.BookmarkAstroInfoDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookmarkAstroInfoMapper {
    @Select(value = "select * from bookmark_astro_info")
    public List<BookmarkAstroInfoDTO> getValue();

    @Select(value = "select * from bookmark_astro_info where user_id = #{usrID")
    public List<BookmarkAstroInfoDTO> getValue(int usrID);


    @Insert(value = "insert into bookmark_astro_info (asto_id, user_id. date) values(#{astro_id}. #{user_id}, #{date})")
    public void setValue(BookmarkAstroInfoDTO bookmarkAstroInfoDTO);

}
