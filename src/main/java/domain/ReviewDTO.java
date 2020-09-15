package domain;

import java.sql.Timestamp;

public class ReviewDTO {
    protected Long id;
    protected String astro_title;
    protected String title;
    protected String value;
    protected String user_name;
    protected Timestamp update_date;
    protected Timestamp create_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAstro_title() {
        return astro_title;
    }

    public void setAstro_title(String astro_title) {
        this.astro_title = astro_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Timestamp getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Timestamp update_date) {
        this.update_date = update_date;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }
}
