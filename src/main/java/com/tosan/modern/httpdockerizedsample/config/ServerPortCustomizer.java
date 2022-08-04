package com.tosan.modern.httpdockerizedsample.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ServerPortCustomizer implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServerPortCustomizer.class);

    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        String env_port = System.getenv("SAMPLE_APP_PORT");
        if (env_port != null) {
            factory.setPort(Integer.valueOf(env_port));
            LOGGER.info("starting program on port: {}", env_port);
        }
    }
}