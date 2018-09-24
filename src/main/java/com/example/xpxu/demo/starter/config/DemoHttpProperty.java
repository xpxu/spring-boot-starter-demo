package com.example.xpxu.demo.starter.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * DATE 2018/9/24.
 * @author xupeng.
 */
@ConfigurationProperties(prefix = "http") // 自动获取配置文件中前缀为http的属性，把值传入对象参数
@Setter
@Getter
public class DemoHttpProperty {

    /**
     * 如果配置文件中配置了http.url属性，则该默认属性会被覆盖
     */
    private String url = "http://www.baidu.com/";

}
