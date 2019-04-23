package org.jeecg;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cache.annotation.EnableCaching;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @author
 * @modify  wujiajun  add  dubbo
 */

@EnableDubbo
@SpringBootApplication
@EnableSwagger2
@EnableCaching // 开启缓存
public class OperatorPayApplication {

    public static void main(String[] args) {
    	System.setProperty("spring.devtools.restart.enabled", "false");
    	SpringApplication.run(OperatorPayApplication.class, args);
    }
}