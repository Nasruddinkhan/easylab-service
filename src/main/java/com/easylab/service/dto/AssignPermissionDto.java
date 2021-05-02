package com.easylab.service.dto;


import com.easylab.service.entity.BaseBean;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Nasruddin khan
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssignPermissionDto extends BaseBean implements Serializable {

    private static final long serialVersionUID = 8692964813513050350L;
    @JsonProperty("assign_permission_id")
    private Long assignPermissionId;

    @JsonProperty("permission_id")
    private Long permissionId;


    @JsonProperty("role_id")
    private Long roleId;
}
