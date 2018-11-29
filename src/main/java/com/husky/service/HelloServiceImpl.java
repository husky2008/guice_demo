package com.husky.service;

/**
 * @ClassName HelloServiceImpl
 * @Description TODO
 * @Author zhangkai
 * @Date 2018/11/29 16:28
 **/
public class HelloServiceImpl implements HelloService {
    @Override
    public void say() {
        System.out.println("hello");
    }
}
