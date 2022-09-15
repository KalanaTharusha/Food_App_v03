package com.example.food_app_v03;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class UserViewModel {
    private MutableLiveData<User> loggedUser;

    public LiveData<User> getLoggedUser(){
        if (loggedUser == null){
            loggedUser = new MutableLiveData<>();
            loggedUser.setValue(null);
        }
        return loggedUser;
    }

    public void setLoggedUser(User user){
        loggedUser.setValue(user);
    }
}
