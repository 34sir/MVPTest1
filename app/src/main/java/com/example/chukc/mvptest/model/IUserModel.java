package com.example.chukc.mvptest.model;

import com.example.chukc.mvptest.bean.UserBean;

/**
 * Created by chukc on 2016/4/26.
 */
public interface IUserModel {
    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    int getID();

    UserBean load(int id);// 通过id读取user信息,返回一个UserBean
}
