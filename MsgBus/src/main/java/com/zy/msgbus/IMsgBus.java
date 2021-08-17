package com.zy.msgbus;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public interface IMsgBus {

    /**
     * 注册订阅者
     * @param
     * @return
     * @author zhangyue
     * @time 2021/8/6 10:50
     */
    Boolean register(Object subscriber);

    /**
     * 发送消息
     * @param data
     * @param <T>
     * @return
     */
    <T> Boolean post(final T data);

    /**
     * 注销订阅者
     * @param subscriber
     * @return
     */
    Boolean unregister(Object subscriber);
}
