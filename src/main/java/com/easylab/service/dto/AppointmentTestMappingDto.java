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
public class AppointmentTestMappingDto  {


    @JsonProperty("app_test_mapping_id")
    private Long appTestMappingId;

    @JsonProperty("test_id")
    private Long testId;

    @JsonProperty("package_id")
    private Long packageId;

    @JsonProperty("status")
    private String status;


}
