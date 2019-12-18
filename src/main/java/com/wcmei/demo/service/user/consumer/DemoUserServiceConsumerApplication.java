package com.wcmei.demo.service.user.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wcmei
 * @date 2019-12-16
 * @description
 */
@SpringBootApplication(scanBasePackages = "com.wcmei.demo")
@EnableDiscoveryClient
@EnableSwagger2
public class DemoUserServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoUserServiceConsumerApplication.class, args);
    }
    //指定启动配置文件
//    public static void main(String[] args) {
//        new SpringApplicationBuilder(RedisApplication.class)
//                .properties(DevConstants.SPRING_PROFILE)
//                .run(args);
//        Main.main(args);
//    }
//
//    public class DevConstants {
    //对应：bootstrap-dev.properties配置文件
//        public static final String SPRING_PROFILE = "spring.profiles.active=dev";
//    }
}
