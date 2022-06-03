package org.kaspars;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.kaspars.web")
public class WebConfig implements WebMvcConfigurer {

    public void configureViewResolvers (ViewResolverRegistry registry) {
        registry.jsp().prefix("/jsp/").suffix(".jsp");
    }

    @Bean
    public ConfigBean createBean() {
        return new ConfigBean();
    }

}