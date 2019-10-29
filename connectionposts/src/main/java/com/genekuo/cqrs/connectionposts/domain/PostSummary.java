package com.genekuo.cqrs.connectionposts.domain;

import java.util.Date;

/**
 * Created by genekuo on 28/10/19.
 */
public class PostSummary {

    private Date date;
    private String usersname;
    private String title;

    public PostSummary(String usersname, String title, Date date) {
        this.date = date;
        this.usersname = usersname;
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public String getUsersname() {
        return usersname;
    }

    public String getTitle() {
        return title;
    }

}
