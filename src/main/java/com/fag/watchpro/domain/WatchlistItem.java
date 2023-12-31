package com.fag.watchpro.domain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fag.watchpro.validation.GoodContent;
import com.fag.watchpro.validation.Priority;

@GoodContent
public class WatchlistItem {

    private Integer id;

    @NotBlank(message = "Please enter the title")
    private String title;

    private String rating;

    @Priority
    private String priority;

    @Size(max = 50, message = "Comment should be maximum 50 characters")
    private String comment;

    private String poster;

    public WatchlistItem(String title, String rating, String priority, String comment, Integer id, String poster) {
        super();
        this.title = title;
        this.rating = rating;
        this.priority = priority;
        this.comment = comment;
        this.id = id;
        this.poster = poster;
    }

    public WatchlistItem() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
