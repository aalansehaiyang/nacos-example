package com.alibaba.nacos.example.spring.boot;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author onlyone
 */
@Component
public class Register {

    @NacosInjected
    private NamingService namingService;

    @PostConstruct
    public void init() throws NacosException {
        System.out.println("开始注册----------------------------");
        namingService.registerInstance("onlyone-serivce-provider", "1.1.1.1", 8082);
    }
}
