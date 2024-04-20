package com.example.week7_assignment1.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("https://m.naver.com/");
    }
    public void changeText(String str){
        mText.setValue(str);
    }
    public LiveData<String> getText() {
        return mText;
    }
}