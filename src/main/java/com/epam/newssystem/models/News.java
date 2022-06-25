package com.epam.newssystem.models;

import java.util.Objects;

public class News {
    private int id;
    private String title;
    private String date;
    private String brief;
    private String content;

    public News(int id, String title, String date, String brief, String content) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.brief = brief;
        this.content = content;
    }

    public News() {

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getBrief() {
        return brief;
    }

    public String getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }

        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }

        News news = (News) object;
        return id == news.id && Objects.equals(title, news.title)
                && Objects.equals(date, news.date)
                && Objects.equals(brief, news.brief)
                && Objects.equals(content, news.content);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id
                + ((title == null) ? 0 : title.hashCode())
                + ((date == null) ? 0 : date.hashCode())
                + ((brief == null) ? 0 : brief.hashCode())
                + ((content == null) ? 0 : content.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return "News {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", brief='" + brief + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
