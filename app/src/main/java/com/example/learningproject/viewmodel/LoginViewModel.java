package com.example.learningproject.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

public class LoginViewModel extends ViewModel {

    private static final String TAG = "LoginViewModel";
    @Inject
    public LoginViewModel() {
        Log.e(TAG, "LoginViewModel: constructor injected" );
    }
}
