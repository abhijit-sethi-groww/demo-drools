package com.drools.sample.drools.poc.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.drools.sample.drools.poc")
public class DroolsConfiguration {

    private static final String DrlFile = "ParseBankStatement.drl";
    public static final String DrlFile2 = "JavaParseBankStatement.drl";

    @Bean
    public KieServices getKieService(){
        return KieServices.Factory.get();
    }
    @Bean
    public KieContainer kieContainer() {
        KieServices kieServices = getKieService();

        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource(DrlFile));
        kieFileSystem.write(ResourceFactory.newClassPathResource(DrlFile2));
        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();
        KieModule kieModule = kieBuilder.getKieModule();

        return kieServices.newKieContainer(kieModule.getReleaseId());
    }
}
