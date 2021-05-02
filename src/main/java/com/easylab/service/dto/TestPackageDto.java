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
public class TestPackageDto  {

    @JsonProperty("package_id")
    private Long packageId;

    @JsonProperty("package_name")
    private String packageName;

    @JsonProperty("short_description")
    private String shortDescription;

    @JsonProperty("long_description")
    private String longDescription;

    @JsonProperty("package_amount")
    private Double packageAmount;

    @JsonProperty("status")
    private String status;

}
