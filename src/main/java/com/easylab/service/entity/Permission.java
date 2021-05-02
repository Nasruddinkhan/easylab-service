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
@Table(name = "permission")
public class Permission extends BaseBean implements Serializable {

    private static final long serialVersionUID = -6347383710573247294L;

    @Id
    @Column(name = "permission_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long permissionId;

    @Column(name = "permission_name")
    private String permissionName;

    @Column(name = "status")
    private String status;

}
