package ru.smakarov.wildfly.wildflyproject;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import ru.smakarov.wildfly.wildflyproject.config.AppConfig;


public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WildflyApplication.class, AppConfig.class);
    }

}
