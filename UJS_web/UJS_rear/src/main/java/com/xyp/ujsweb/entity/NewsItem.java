package com.xyp.ujsweb.entity;

/**
 * NewsItem: 用于存放新闻信息的实体类
 *
 * @author XvYanPeng
 * @date 2019/4/29 16:14
 */
public class NewsItem {
    private String title;
    private String Url;
    private String date;

    @Override
    public String toString() {
        return "NewsItem{" +
                "title='" + title + '\'' +
                ", Url='" + Url + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public NewsItem() {
    }

    public NewsItem(String title, String url, String date) {
        this.title = title;
        Url = url;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

}
