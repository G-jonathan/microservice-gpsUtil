package com.openclassroomsproject.microservicegpsUtil.configuration;

import gpsUtil.GpsUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Configuration class
 *
 * @author jonathan GOUVEIA
 * @version 1.0
 */
@Configuration
public class GpsUtilConfig {

    /**
     * Allows to load the library in the spring context
     *
     * @return The library used by this microservice
     */
    @Bean
    public GpsUtil getGpsUtil() {
        return new GpsUtil();
    }
}