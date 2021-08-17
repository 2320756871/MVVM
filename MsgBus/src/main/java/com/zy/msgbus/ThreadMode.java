package com.zy.msgbus;


public enum ThreadMode {
    /**
     * 线程类型枚举
     * @param
     * Main        —— 主线程执行
     * Background  —— 如果是子线程直接使用，否则创建子线程
     * Async       —— 无论是否子线程都创建新的线程
     * Default     —— 和发布者同一线程
     * @return
     * @author zhangyue
     * @time 2021/8/5 14:48
     */
    Main,Background,Async,Default
}
