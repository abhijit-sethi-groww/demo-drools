package com.drools.sample.drools.poc.controller;

import com.drools.sample.drools.poc.dto.FileUploadDto;
import com.drools.sample.drools.poc.service.FileUploadHandlerService;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/file/")
public class FileUploadController {

    @Autowired
    FileUploadHandlerService fileUploadHandlerService;
    @PostMapping("upload")
    public void uploadFile(@RequestBody FileUploadDto fileUploadDto) {
        fileUploadHandlerService.handleFileUpload(fileUploadDto);
    }
}
