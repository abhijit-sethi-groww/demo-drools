package com.drools.sample.drools.poc.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
@Setter
@Getter
public class FileUploadDto {
    int numRows;
    String fileName;
    String status;
}
