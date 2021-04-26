package com.easylab.service.dto;

import static com.easylab.service.constant.MessageConstant.NAME_EMPTY_VLD;
import static com.easylab.service.constant.MessageConstant.EMAIL_EMPTY_VLD;
import static com.easylab.service.constant.MessageConstant.MOBILE_NO_EMPTY_VLD;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;

@Data
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
    @NotBlank(message = MOBILE_NO_EMPTY_VLD)
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
