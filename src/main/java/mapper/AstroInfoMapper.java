package mapper;

import domain.AstroInfoDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AstroInfoMapper {
    @Select(value = "select * from astro_info")
    public List<AstroInfoDTO> getValue();

    @Select(value = "select * from astro_info where id = #{id}")
    public List<AstroInfoDTO> getValue(int id);

    @Insert(value = "insert into astro_info (astro_title, astro_event, astro_date) values (#{astro_title}, #{astro_event}, #{astro_date}")
    public void setValue(AstroInfoDTO astroInfoDTO);
}
