package com.jiuying.entity;

/**
 * @auther guoruowang
 * @Date 2019/9/2 16:33
 **/
public class User {

    private Long id;

    private String username;

    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
