package com.husky.service;


import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @ClassName HaiServiceImpl
 * @Description TODO
 * @Author zhangkai
 * @Date 2018/11/29 16:43
 **/
public class HaiServiceImpl implements HaiService {
    @Inject
    @Named("abc")
    private  HelloService helloService;

    @Override
    public void hai() {
         helloService.say();
    }
}
