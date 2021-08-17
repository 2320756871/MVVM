package com.zy.mvvmcore.cmds;

import android.os.Build;


public class BindCommand<T,R> {
    private Action action;
    private Action1 action1;
    private Function function;
    private Function1 function1;

    public BindCommand(Action _action){
        this.action= _action;
    }

    public BindCommand(Action1 _action){
        this.action1= _action;
    }

    public BindCommand(Function _function){
        this.function= _function;
    }

    public BindCommand(Function1 _function){
        this.function1= _function;
    }

    public void execute(){
        if (action!=null){
            action.Execute();
        }
    }

    public void Execute(T param){
        if (action1!=null){
            action1.Execute(param);
        }
    }

    public R fExecute(){
        if (function!=null){
           return (R) function.Execute();
        }
        return null;
    }

    public R fExecute(T param){
        if (function1!=null){
            return (R) function1.Execute(param);
        }
        return null;
    }

}
