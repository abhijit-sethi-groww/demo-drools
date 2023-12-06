package com.drools.sample.drools.poc.config;

import org.kie.api.KieServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {
    @Bean
    public KieServices getKieService(){
        return KieServices.Factory.get();
    }


}
