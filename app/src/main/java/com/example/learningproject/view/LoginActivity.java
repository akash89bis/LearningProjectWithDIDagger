package com.example.learningproject.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.example.learningproject.R;
import com.example.learningproject.viewmodel.LoginViewModel;
import com.example.learningproject.viewmodel.ProviderFactory;

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

    @Inject
    ProviderFactory providerFactory;

    private LoginViewModel viewModel;

    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.e(TAG, "onCreate: "+ name);
        ButterKnife.bind(this);

        viewModel = ViewModelProviders.of(this,providerFactory).get(LoginViewModel.class);
        edtName.setText(name);

        loginBtn.setOnClickListener(view -> {
            Intent nextIntent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(nextIntent);
        });
    }
}
