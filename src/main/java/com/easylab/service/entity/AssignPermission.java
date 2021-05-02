package com.easylab.service.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
/**
 * @author Nasruddin khan
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "assign_permission")
public class AssignPermission extends BaseBean implements Serializable {

    private static final long serialVersionUID = 8692964813513050350L;
    @Id
    @Column(name = "assign_permission_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assignPermissionId;

    @Column(name = "permission_id")
    private Long permissionId;


    @Column(name = "role_id")
    private Long roleId;
}
