package com.example.learnhtml.ui.quiz;

//public class QuizViewModel {
//}

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuizViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public void QuizViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Quiz fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}