package com.xyp.ujsweb.entity;

/**
 * User:user实体类
 *
 * @author XvYanPeng
 * @date 2019/5/1 19:03
 */
public class User {
    private Integer id;
    private String userName;
    private Integer gender;
    private Integer birthday;
    private String password;
    private String email;
    private String telephoneNumber;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public User() {
    }

    public User(Integer id, Integer gender, Integer birthday, String userName, String password, String email, String telephoneNumber) {
        this.id = id;
        this.gender = gender;
        this.birthday = birthday;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
    }
}
