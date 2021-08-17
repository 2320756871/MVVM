package com.zy.mvvmcore.cmds;

import android.util.Log;
import android.view.View;

import androidx.databinding.BindingAdapter;

import com.jakewharton.rxbinding2.view.RxView;

import java.util.concurrent.TimeUnit;

import io.reactivex.functions.Consumer;


public class ViewAdapter {

    @BindingAdapter(value = {"onClickCmd"},requireAll = false)
    public static void onClickCmd(View view, final BindCommand clickCmd){
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (null!=clickCmd){
//                    clickCmd.execute();
//                }
//            }
//        });
        RxView.clicks(view).throttleFirst(3, TimeUnit.SECONDS)
                .subscribe(new Consumer<Object>() {
                    @Override
                    public void accept(Object o) throws Exception {
                        if (null!=clickCmd){
                            clickCmd.execute();
                        }
                    }
                });

    }
}
