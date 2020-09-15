package domain;

import java.sql.Date;

public class BookmarkAstroInfoDTO {
    protected Long id;
    protected Long astro_id;
    protected Long user_id;
    protected Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAstro_id() {
        return astro_id;
    }

    public void setAstro_id(Long astro_id) {
        this.astro_id = astro_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
