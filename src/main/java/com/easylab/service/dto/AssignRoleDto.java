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
public class AssignRoleDto  {

    @JsonProperty("assign_role_id")
    private Long assignRoleId;

    @JsonProperty("role_id")
    private Long roleId;

    @JsonProperty("user_id")
    private Long userId;

}
