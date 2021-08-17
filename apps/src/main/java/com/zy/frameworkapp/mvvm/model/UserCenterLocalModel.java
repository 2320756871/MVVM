package com.zy.frameworkapp.mvvm.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.zy.common.utils.ThreadUtils;
import com.zy.frameworkapp.mvvm.entity.UserEntity;
import com.zy.mvvmcore.model.IModel;


public class UserCenterLocalModel implements IModel {

    public LiveData<UserEntity> register(UserEntity entity){
        MutableLiveData<UserEntity> entityMutableLiveData=new MutableLiveData<>();
        UserEntity entity1=new UserEntity("18011111111","小明",21,0,"天津");
        if(ThreadUtils.isMainThread()){
            entityMutableLiveData.setValue(entity1);
        }else{
            entityMutableLiveData.postValue(entity1);
        }
        return entityMutableLiveData;
    }

}
