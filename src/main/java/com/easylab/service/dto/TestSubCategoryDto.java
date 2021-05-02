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
public class TestSubCategoryDto {

    @JsonProperty("test_id")
    private Long testId;

    @JsonProperty("test_name")
    private String testName;

    @JsonProperty("short_description")
    private String shortDescription;

    @JsonProperty("long_description")
    private String longDescription;

    @JsonProperty("status")
    private String status;

    @JsonProperty("category_id")
    private Long categoryId;
}
