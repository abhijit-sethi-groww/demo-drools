package com.drools.sample.drools.poc.service.impl;

import com.drools.sample.drools.poc.dto.FileUploadDto;
import com.drools.sample.drools.poc.enums.FileFormatStatus;
import com.drools.sample.drools.poc.service.FileUploadHandlerService;
import lombok.extern.slf4j.Slf4j;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class FileUploadHandlerServiceImpl implements FileUploadHandlerService {

    @Override
    public void handleFileUpload() {
        log.info("I am here");
        FileUploadDto fileUploadDto = FileUploadDto.builder().fileName("CAN YOU PARSE THIS").numRows(100).build();
    }
}
