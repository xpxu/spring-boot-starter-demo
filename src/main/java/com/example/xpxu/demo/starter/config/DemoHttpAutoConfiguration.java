package com.example.xpxu.demo.starter.config;

import com.example.xpxu.demo.starter.DemoHttpClient;
import javax.annotation.Resource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * DATE 2018/9/24.
 * @author xupeng.
 */
@Configuration
@EnableConfigurationProperties(DemoHttpProperty.class)
public class DemoHttpAutoConfiguration {

    @Resource
    private DemoHttpProperty properties; // 使用配置

    // 在Spring上下文中创建一个对象
    @Bean
    @ConditionalOnMissingBean
    public DemoHttpClient init() {
        DemoHttpClient client = new DemoHttpClient();

        String url = properties.getUrl();
        client.setUrl(url);
        return client;
    }

}

