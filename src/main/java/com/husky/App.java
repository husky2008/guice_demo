package com.husky;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.husky.service.HaiService;
import com.husky.service.moudle.ModuleDemo;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new ModuleDemo());
        HaiService helloService = injector.getInstance(HaiService.class);
        helloService.hai();
    }
}
