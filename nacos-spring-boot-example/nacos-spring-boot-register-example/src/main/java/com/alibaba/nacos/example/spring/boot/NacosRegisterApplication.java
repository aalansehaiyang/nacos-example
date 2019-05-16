package com.alibaba.nacos.example.spring.boot;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.util.List;

@SpringBootApplication
public class NacosRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosRegisterApplication.class, args);
    }

//    @Bean
//    @Order(Ordered.LOWEST_PRECEDENCE)
//    public CommandLineRunner firstCommandLineRunner() {
//        return new FirstCommandLineRunner();
//    }
//
//    @Bean
//    @Order(Ordered.LOWEST_PRECEDENCE - 1)
//    public CommandLineRunner secondCommandLineRunner() {
//        return new SecondCommandLineRunner();
//    }
//
//    public static class FirstCommandLineRunner implements CommandLineRunner {
//
//        @NacosInjected
//        private NamingService namingService;
//
//        @Override
//        public void run(String... args) throws Exception {
//            System.out.println("start to register");
//            namingService.registerInstance("onlyone-service-provider", "1.1.1.1", 8080);
//        }
//    }
//
//    public static class SecondCommandLineRunner implements CommandLineRunner {
//
//        @NacosInjected
//        private NamingService namingService;
//
//        @Override
//        public void run(String... args) throws Exception {
//            List<Instance> instanceList = namingService.getAllInstances("example");
//            System.out.println("found instance: " + instanceList.size());
//            instanceList.forEach(instance -> {
//                System.out.println(instance);
//            });
//        }
//    }

}
