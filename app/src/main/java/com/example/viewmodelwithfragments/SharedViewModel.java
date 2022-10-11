package com.example.viewmodelwithfragments;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    MutableLiveData<UserModel> userModelMutableLiveData ;

   public void init()
   {
       userModelMutableLiveData = new MutableLiveData<>();

   }

   public void sendMessage(UserModel userModel)
   {
       userModelMutableLiveData.setValue(userModel);
   }

   public LiveData<UserModel> getMessage()
   {
       return userModelMutableLiveData;
   }
}
