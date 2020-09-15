package domain;

import java.sql.Timestamp;

public class AstroInfoDTO{
    protected Long id;
    protected String astro_title;
    protected String astro_event;
    protected Timestamp astro_date;
    protected Long recommend_count;

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

    public String getAstro_event() {
        return astro_event;
    }

    public void setAstro_event(String astro_event) {
        this.astro_event = astro_event;
    }

    public Timestamp getAstro_date() {
        return astro_date;
    }

    public void setAstro_date(Timestamp astro_date) {
        this.astro_date = astro_date;
    }

    public Long getRecommend_count() {
        return recommend_count;
    }

    public void setRecommend_count(Long recommend_count) {
        this.recommend_count = recommend_count;
    }
}
