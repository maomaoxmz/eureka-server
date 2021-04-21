package com.ny.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// http://localhost:8081/eureka/apps 查看注册到eureka的所有实例数据--原生数据
// http://localhost:8081/eureka/apps/EUREKA-ORDER 查看某个应用--原生数据
// http://localhost:8081/eureka/apps/EUREKA-ORDER/DESKTOP-2GK20C0:eureka-order:7003 查看某个实例--原生数据
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
