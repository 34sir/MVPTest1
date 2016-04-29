package com.example.chukc.mvptest.model;

import com.example.chukc.mvptest.bean.UserBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chukc on 2016/4/26.
 */
public class UserModel implements IUserModel {
    private UserBean bean;
    private int id;
    private List<UserBean> userBean = new ArrayList<UserBean>();

    @Override
    public void setID(int id) {
        this.id = id;
        bean=new UserBean();
        bean.setId(id);
    }

    @Override
    public void setFirstName(String firstName) {
        bean.setmFirstName(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        bean.setmLastName(lastName);
        userBean.add(bean);
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public UserBean load(int id) {
        UserBean UserBean=null;
        for (UserBean bean : userBean) {
            if (bean.getId() == id) {
                UserBean=bean;
            } else {
            }
        }
        return  UserBean;
    }
}
