package com.easylab.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * @author Nasruddin khan
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LabMasterDto {


    @JsonProperty("lab_id")
    private Long labId;

    @JsonProperty("lab_name")
    private String labName;

    @JsonProperty("email_id")
    private String emailId;

    @JsonProperty("mobile_no")
    private String mobileNo;

    @JsonProperty("phone_no")
    private String phoneNo;

    @JsonProperty("website_url")
    private String websiteUrl;

    @JsonProperty("report_url")
    private String reportUrl;


    @JsonProperty("address")
    private String address;

    @JsonProperty("status")
    private String status;

}
