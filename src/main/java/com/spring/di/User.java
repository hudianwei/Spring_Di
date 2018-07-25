package com.spring.di;

import java.util.List;
import java.util.Properties;

public class User {
    //普通类型赋值
    public String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //对象赋值
    public UserService userservice;

    public UserService getUserservice() {
        return userservice;
    }

    public void setUserservice(UserService userservice) {
        this.userservice = userservice;
    }

    //集合赋值
    public List<String> usernamelist;

    public List<String> getUsernamelist() {
        return usernamelist;
    }

    public void setUsernamelist(List<String> usernamelist) {
        this.usernamelist = usernamelist;
    }

    //给属性文件中的字段赋值
    public Properties props;

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }


}
