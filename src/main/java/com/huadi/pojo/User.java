package com.huadi.pojo;

public class User {


    /**
     * 这里的属性名称需要和数据库中的字段名称一致，才能使用mybatis封装返回
     */
    private int user_id;
    private  String user_name;
    private  String user_ps;
    private  int user_age;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_ps() {
        return user_ps;
    }

    public void setUser_ps(String user_ps) {
        this.user_ps = user_ps;
    }

    public int getUser_age() {
        return user_age;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_ps='" + user_ps + '\'' +
                ", user_age=" + user_age +
                '}';
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }
}
