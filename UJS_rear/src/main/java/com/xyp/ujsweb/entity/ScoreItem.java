package com.xyp.ujsweb.entity;

/**
 * ScoreItem:
 *
 * @author XvYanPeng
 * @date 2019/5/2 11:16
 */
public class ScoreItem {
    private String userName;
    private Integer score;
    private Integer time;

    @Override
    public String toString() {
        return "ScoreItem{" +
                "userName='" + userName + '\'' +
                ", score=" + score +
                ", time=" + time +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public ScoreItem() {
    }

    public ScoreItem(String userName, Integer score, Integer time) {
        this.userName = userName;
        this.score = score;
        this.time = time;
    }
}
