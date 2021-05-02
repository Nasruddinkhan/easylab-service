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
public class PermissionDto  {

    @JsonProperty("permission_id")
    private Long permissionId;

    @JsonProperty("permission_name")
    private String permissionName;

    @JsonProperty("status")
    private String status;

}
