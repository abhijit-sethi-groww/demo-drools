package com.drools.sample.drools.poc.service.impl;

import com.drools.sample.drools.poc.dto.FileUploadDto;
import com.drools.sample.drools.poc.service.FileUploadHandlerService;
import lombok.extern.slf4j.Slf4j;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class FileUploadHandlerServiceImpl implements FileUploadHandlerService {

    @Autowired
    private KieContainer kieContainer;

    public void parseFileUploadDto(FileUploadDto fileUploadDto) {
        KieSession kieSession = kieContainer.newKieSession();
        try{
            kieSession.insert(fileUploadDto);
            kieSession.setGlobal("response", fileUploadDto);
            kieSession.fireAllRules();
        }
        finally {
            kieSession.dispose();
        }
    }
    @Override
    public void handleFileUpload() {
        log.info("I am here");
        FileUploadDto fileUploadDto = FileUploadDto.builder().fileName("CAN YOU PARSE THIS").numRows(100).build();
        applyRules(fileUploadDto);

        FileUploadDto fileUploadDto2 = FileUploadDto.builder().fileName("ABC").numRows(100).build();
        applyRules(fileUploadDto2);
    }

    private void applyRules(FileUploadDto fileUploadDto) {
        parseFileUploadDto(fileUploadDto);
        log.info("{} parsed response", fileUploadDto);
    }
}
