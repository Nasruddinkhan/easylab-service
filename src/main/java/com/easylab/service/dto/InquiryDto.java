package com.easylab.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;

import static com.easylab.service.constant.MessageConstants.*;
/**
 * @author Nasruddin
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class InquiryDto {
    @JsonProperty("inq_id")
    private Long inqId;
    @NotBlank(message = NAME_EMPTY_VLD)
    @JsonProperty("name")
    private String name;
    @NotBlank(message = MOB_NO_EMPTY_VLD)
    @JsonProperty("mobile_no")
    private String mobileNo;
    @NotBlank(message = EMAIL_EMPTY_VLD)
    @JsonProperty("email_id")
    private String emailId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("company_Id")
    private Long companyId;

}
