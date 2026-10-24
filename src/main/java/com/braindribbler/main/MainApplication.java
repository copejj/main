package com.braindribbler.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.info.GitProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Properties;

@SpringBootApplication
public class MainApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Configuration
    static class GitPropertiesFallbackConfiguration {
        @Bean
        @ConditionalOnMissingBean(GitProperties.class)
        public GitProperties gitProperties() {
            return new GitProperties(new Properties());
        }
    }
}
