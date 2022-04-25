package com.codejam.jetcache;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import com.codejam.jetcache.controller.UserCacheController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMethodCache(basePackages = "com.codejam.jetcache")
@EnableCreateCacheAnnotation
public class JetCacheStarter {

    public static void main(String[] args) {

        SpringApplication.run(JetCacheStarter.class, args);

        System.out.println("jetCache demo star up done. ...");

    }
}
