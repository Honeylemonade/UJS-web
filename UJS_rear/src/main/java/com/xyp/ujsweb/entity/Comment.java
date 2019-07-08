package com.xyp.ujsweb.entity;

/**
 * Comment:
 *
 * @author XvYanPeng
 * @date 2019/5/11 20:49
 */
public class Comment {
    private String userName;
    private String content;
    private Integer time;

    @Override
    public String toString() {
        return "Comment{" +
                "userName='" + userName + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Comment() {
    }

    public Comment(String userName, String content, Integer time) {
        this.userName = userName;
        this.content = content;
        this.time = time;
    }
}
