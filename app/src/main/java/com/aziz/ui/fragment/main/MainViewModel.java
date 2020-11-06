package com.aziz.ui.fragment.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    MutableLiveData<String> name = new MutableLiveData<>();
    Integer num = 10;

    void increases() {
        if (num <= 20)
            num++;
        setNum();
    }

    void decreases() {
        if (num >= 0)
            num--;
        setNum();
    }

    void setNum() {
        name.setValue(String.valueOf(num));
    }

}