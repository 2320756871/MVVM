package com.zy.msgbus;

import java.net.PortUnreachableException;


public class MsgBus {
    private static class MsgBusHolder{
        private static MsgBus INSTANCE=new MsgBus();
    }

    private IMsgBus impl;
    private MsgBus(){
        impl=new MsgBusImpl();
    }
    public static MsgBus getInstance(){return MsgBusHolder.INSTANCE;}

    /**
     * 设置你自己的实现
     * @param 
     * @return 
     * @author zhangyue
     * @time 2021/8/9 15:46
     */ 
    public void setMsgBusImpl(IMsgBus msgBusImpl){
        impl=msgBusImpl;
    }

    public IMsgBus getDefault(){
        return impl;
    }
}
