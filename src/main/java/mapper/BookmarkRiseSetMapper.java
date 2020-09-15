package mapper;

import domain.BookmarkRiseSetInfoDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookmarkRiseSetMapper {
    @Select(value = "select * from bookmark_rise_set_info")
    public List<BookmarkRiseSetInfoDTO> getValue();

    @Select(value = "select * from bookmark_rise_set_info where user_id = #{usrID}")
    public List<BookmarkRiseSetInfoDTO> getValue(int usrID);

    @Insert(value = "insert into bookmark_rise_set_info (bookmark_name, user_id, date, location, sun_rise, sun_set, moon_rise, moon_set, lun_age) values (#{bookmark_name}, #{user_id}, #{date}, #{location}, #{sun_rise}, #{sun_set}, #{moon_rise}, #{moon_set}, #{lun_age}")
    public void setValue(BookmarkRiseSetInfoDTO bookmarkRiseSetInfoDTO);
}
