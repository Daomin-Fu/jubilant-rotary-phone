package java.com.bao.qi.entity;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Description: 用户实体类
 * @Author: Daomin.Fu
 * @Date: 2018/11/16 23:07
 **/
public class User implements Serializable {

    private static final long serialVersionUID = -1695973853274402680L;

    private int userid;

    private String login_name;

    private String login_pwd;

    public User() {

    }

    public User(int userid, String login_name, String login_pwd) {
        super();
        this.userid = userid;
        this.login_name = login_name;
        this.login_pwd = login_pwd;
    }

    public int getUserid() {
        return userid;
    }


    public void setUserid(int userid) {
        this.userid = userid;
    }


    public String getLogin_name() {
        return login_name;
    }


    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }


    public String getLogin_pwd() {
        return login_pwd;
    }


    public void setLogin_pwd(String login_pwd) {
        this.login_pwd = login_pwd;
    }


}
