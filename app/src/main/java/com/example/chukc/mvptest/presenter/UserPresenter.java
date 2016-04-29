package com.example.chukc.mvptest.presenter;

import com.example.chukc.mvptest.bean.UserBean;
import com.example.chukc.mvptest.model.IUserModel;
import com.example.chukc.mvptest.model.UserModel;
import com.example.chukc.mvptest.view.IUserView;

/**
 * Created by chukc on 2016/4/26.
 */
public class UserPresenter {
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser( int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser( int id) {
        UserBean user = mUserModel.load(id);
        mUserView.setFirstName(user.getmFirstName()); // 通过调用IUserView的方法来更新显示
        mUserView.setLastName(user.getmLastName());
    }
}
