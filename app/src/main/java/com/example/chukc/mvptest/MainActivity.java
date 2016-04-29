package com.example.chukc.mvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.chukc.mvptest.presenter.UserPresenter;
import com.example.chukc.mvptest.view.IUserView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,IUserView {
    UserPresenter presenter;
    EditText id,first,last;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.but_save).setOnClickListener( this);
        findViewById(R.id.but_read).setOnClickListener( this);
        id = (EditText) findViewById(R.id.et_id);
        first = (EditText) findViewById(R.id.et_first);
        last = (EditText) findViewById(R.id.et_last);

        presenter = new UserPresenter( this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but_save:
                presenter.saveUser(getID(), getFristName(), getLastName());
                first.setText("");
                last.setText("");
                break;
            case R.id.but_read:
                presenter.loadUser(getID());
                break;
            default:
                break;
        }
    }

    @Override
    public int getID() {
        return new Integer( id.getText().toString());
    }

    @Override
    public String getFristName() {
        return first.getText().toString();
    }

    @Override
    public String getLastName() {
        return last.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        first.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        last.setText(lastName);
    }
}
