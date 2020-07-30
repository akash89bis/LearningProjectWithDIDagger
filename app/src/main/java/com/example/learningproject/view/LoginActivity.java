package com.example.learningproject.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import com.example.learningproject.R;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;

public class LoginActivity extends DaggerAppCompatActivity {

    @BindView(R.id.edtName)
    EditText edtName;

    @BindView(R.id.btn_login)
    Button loginBtn;

    @Inject
    @Named("First Movie")
    String name;

    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.e(TAG, "onCreate: "+ name);
        ButterKnife.bind(this);

        edtName.setText(name);

        loginBtn.setOnClickListener(view -> {
            Intent nextIntent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(nextIntent);
        });
    }
}
