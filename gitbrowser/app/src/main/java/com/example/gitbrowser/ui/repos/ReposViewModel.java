package com.example.gitbrowser.ui.repos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReposViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReposViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Profile fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}