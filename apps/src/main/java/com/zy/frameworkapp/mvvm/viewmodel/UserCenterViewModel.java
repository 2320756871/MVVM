package com.zy.frameworkapp.mvvm.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.zy.common.utils.ThreadUtils;
import com.zy.frameworkapp.mvvm.entity.UserEntity;
import com.zy.frameworkapp.mvvm.repository.UserCenterRepository;
import com.zy.mvvmcore.viewmodel.BaseViewModel;


public class UserCenterViewModel extends BaseViewModel<UserCenterRepository> {

    /**
     * 作为XML中数据绑定的数据源
     * @param
     * @return 
     * @author zhangyue
     * @time 2021/8/17 9:05
     */ 
    public MutableLiveData<UserEntity> pageDataSource=new MutableLiveData<>();;

    public UserCenterViewModel(LifecycleOwner owner) {
        super(owner);
        UserEntity userEntity=new UserEntity();
        if (ThreadUtils.isMainThread()){
            pageDataSource.setValue(userEntity);
        }else{
            pageDataSource.postValue(userEntity);
        }
    }


    @Override
    protected UserCenterRepository createRepository() {

        return new UserCenterRepository();
    }


    public LiveData<UserEntity> register(UserEntity entity){
       return mRepository.register(entity);
    }

}
