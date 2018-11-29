package com.husky.service.moudle;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.husky.service.*;

/**
 * @ClassName ModuleDemo
 * @Description
 * @Author zhangkai
 * @Date 2018/11/29 16:30
 **/
public class ModuleDemo extends AbstractModule {

    /**
     * 所有类的实现和绑定都是通过实现 AbstractModule中的configure方法中实现
      */
    @Override
    protected void configure() {
        this.bind(HelloService.class).to(HelloServiceImpl.class).asEagerSingleton();
        this.bind(HaiService.class).to(HaiServiceImpl.class).asEagerSingleton();
        this.bind(HelloService.class).annotatedWith(Names.named("abc")).to(HelloServiceImpl2.class).asEagerSingleton();
    }
}
