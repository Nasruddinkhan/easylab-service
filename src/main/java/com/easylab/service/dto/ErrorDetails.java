package com.easylab.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDetails {
    @JsonProperty("error_message")
    private String errorMessage;
    @JsonProperty("error_code")
    private String errorCode;
    private Date date;
}
