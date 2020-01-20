package com.kiendo.vietnamnews;

public class NewsItem {
    private String title;
    private String link;
    private String image;
    private String publishDate;

    public NewsItem(String title, String link, String image, String publishDate) {
        this.title = title;
        this.link = link;
        this.image = image;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
