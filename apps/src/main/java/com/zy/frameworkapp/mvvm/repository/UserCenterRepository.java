package com.zy.frameworkapp.mvvm.repository;

import androidx.lifecycle.LiveData;

import com.zy.frameworkapp.mvvm.model.UserCenterLocalModel;
import com.zy.frameworkapp.mvvm.entity.UserEntity;
import com.zy.mvvmcore.repository.BaseRepository;
import com.zy.mvvmcore.model.Model;


public class UserCenterRepository extends BaseRepository {

    @Model
    UserCenterLocalModel localModel;

    public LiveData<UserEntity> register(UserEntity entity){
        /**
         * 如果有网我们用的Remote的Model
         * 如果没网我们用的Local的Model
         */

       return localModel.register(entity);
    }
}
