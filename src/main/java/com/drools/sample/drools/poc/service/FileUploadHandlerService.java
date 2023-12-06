package com.drools.sample.drools.poc.service;

import com.drools.sample.drools.poc.dto.FileUploadDto;

public interface FileUploadHandlerService {
    FileUploadDto handleFileUpload(FileUploadDto fileUploadDto);
}
